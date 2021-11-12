package com.spring.professional.exam.tutorial.module03.question18.service;

import com.spring.professional.exam.tutorial.module03.question18.exception.CustomException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

    @Transactional // by default unchecked exceptions will automatically roll back
    public void methodWithUncheckedExceptionCausingRollback() {
        throw new IllegalArgumentException("test unchecked exception that will cause rollback");
    }

    @Transactional // methods that throw checked exceptions, roll back will not be done by default
    public void methodWithCheckedExceptionNotCausingRollback() throws CustomException {
        throw new CustomException("test checked exception that will not cause rollback");
    }

    // e.g. overriding the default behaviour of spring disabling roll back for unchecked exceptions
    @Transactional(noRollbackFor = IllegalArgumentException.class)
    public void methodWithUncheckedExceptionNotCausingRollback() {
        throw new IllegalArgumentException("test unchecked exception that will not cause rollback because of noRollbackFor field");
    }

    // e.g. overriding the default behaviour of spring enabling roll back for checked exceptions
    @Transactional(rollbackFor = CustomException.class)
    public void methodWithCheckedExceptionCausingRollback() throws CustomException {
        throw new CustomException("test checked exception that will cause rollback because of rollbackFor field");
    }
}
