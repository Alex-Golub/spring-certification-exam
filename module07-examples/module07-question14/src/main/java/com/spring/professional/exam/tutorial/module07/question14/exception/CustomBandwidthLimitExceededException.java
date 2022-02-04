package com.spring.professional.exam.tutorial.module07.question14.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BANDWIDTH_LIMIT_EXCEEDED, reason = "Custom Bandwidth Limit Exceeded Exception")
public class CustomBandwidthLimitExceededException extends RuntimeException {
}
