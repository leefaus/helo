package com.cl9p.controllers;

import com.cl9p.aspects.AutoValidate;
import com.cl9p.domain.User;
import com.cl9p.exceptions.FindAllUsersConstraintException;
import org.hibernate.validator.method.MethodConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@AutoValidate
public class UserService {
    @Autowired
    private User u;

    public @Valid Set<User> findAllUsers() throws FindAllUsersConstraintException {
        Set<User> set = new HashSet<User>();
        set.add(u);
        return set;
    }
}
