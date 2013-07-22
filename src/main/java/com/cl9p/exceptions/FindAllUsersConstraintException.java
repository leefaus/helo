package com.cl9p.exceptions;

import org.apache.log4j.Logger;
import org.hibernate.validator.method.MethodConstraintViolation;
import org.hibernate.validator.method.MethodConstraintViolationException;

import java.util.Set;

public class FindAllUsersConstraintException extends MethodConstraintViolationException {
    Logger logger = Logger.getLogger(FindAllUsersConstraintException.class);

    public FindAllUsersConstraintException(Set<? extends MethodConstraintViolation<?>> constraintViolations) {
        super(constraintViolations);
        logger.info("Uh Oh, Something Bad Happened");
    }
}
