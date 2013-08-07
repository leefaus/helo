package com.cl9p.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.hibernate.validator.method.MethodConstraintViolation;
import org.hibernate.validator.method.MethodConstraintViolationException;
import org.hibernate.validator.method.MethodValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.validation.Validator;
import java.lang.reflect.Constructor;
import java.util.Set;

@Aspect
public class ValidationInterceptor {

    @Inject
    private Validator validator;

    @Around("execution(public * *(..)) && @within(com.cl9p.aspects.AutoValidate)")
    public Object validateMethodInvocation(ProceedingJoinPoint pjp) throws Throwable {
        Logger logger = LoggerFactory.getLogger(this.getClass());

        Object result;
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        MethodValidator methodValidator = validator.unwrap( MethodValidator.class );

        Set<MethodConstraintViolation<Object>> parametersViolations = methodValidator.validateAllParameters(
                pjp.getTarget(), signature.getMethod(), pjp.getArgs()
        );
        if ( !parametersViolations.isEmpty() ) {
            Class[] exceptions = signature.getExceptionTypes();
            if (exceptions.length != 0) {
                for (Class exception : exceptions) {
                    Constructor constructor = exception.getDeclaredConstructor(java.util.Set.class);
                }
            }  else {
                throw new MethodConstraintViolationException(parametersViolations);
            }
        }

        result =  pjp.proceed(); //Execute the method

        Set<MethodConstraintViolation<Object>> returnValueViolations = methodValidator.validateReturnValue(
                pjp.getTarget(), signature.getMethod(), result
        );
        if ( !returnValueViolations.isEmpty() ) {
            Class[] exceptions = signature.getExceptionTypes();
            if (exceptions.length != 0) {
                for (Class exception : exceptions) {
                    Constructor constructor = exception.getDeclaredConstructor(java.util.Set.class);
                    throw (Throwable) constructor.newInstance(returnValueViolations);
                }
            } else {
                throw new MethodConstraintViolationException(returnValueViolations);
            }
        }

        return result;
    }


}
