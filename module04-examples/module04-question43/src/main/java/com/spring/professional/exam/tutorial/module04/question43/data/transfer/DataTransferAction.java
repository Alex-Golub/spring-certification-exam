package com.spring.professional.exam.tutorial.module04.question43.data.transfer;

import com.spring.professional.exam.tutorial.module04.question43.data.layer.FtpDataLayer;
import com.spring.professional.exam.tutorial.module04.question43.data.layer.HttpDataLayer;
import com.spring.professional.exam.tutorial.module04.question43.ds.Person;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class DataTransferAction {

    FtpDataLayer ftpDataLayer;
    HttpDataLayer httpDataLayer;

    public void transfer() {
        List<Person> personData = ftpDataLayer.getData();

        httpDataLayer.saveData(personData);
    }
}
