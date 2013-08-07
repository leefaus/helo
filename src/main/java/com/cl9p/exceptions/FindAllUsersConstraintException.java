package com.cl9p.exceptions;

import org.hibernate.validator.method.MethodConstraintViolation;
import org.hibernate.validator.method.MethodConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class FindAllUsersConstraintException extends MethodConstraintViolationException {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public FindAllUsersConstraintException(Set<? extends MethodConstraintViolation<?>> constraintViolations) {
        super(constraintViolations);
        logger.info("Uh Oh, Something Bad Happened");
    }
}
