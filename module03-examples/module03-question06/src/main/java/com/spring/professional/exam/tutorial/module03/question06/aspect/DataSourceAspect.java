package com.spring.professional.exam.tutorial.module03.question06.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;
import java.sql.Connection;

@Component
@Aspect
public class DataSourceAspect {
    @Around("target(javax.sql.DataSource)")
    public Object aroundDataSource(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Data Source Trace: " + joinPoint.getSignature());

        Object returnObject = joinPoint.proceed();
        if (returnObject instanceof Connection) {
            return createConnectionProxy((Connection) returnObject);
        } else
            return returnObject;
    }

    /**
     * Wrapping the connection with JDKProxy to trace connections that are created/disposed
     */
    private Connection createConnectionProxy(Connection connection) {
        return (Connection) Proxy.newProxyInstance(DataSourceAspect.class.getClassLoader(),
                                                   new Class[]{Connection.class},
                                                   new ConnectionInvocationHandler(connection)
        );
    }
}
