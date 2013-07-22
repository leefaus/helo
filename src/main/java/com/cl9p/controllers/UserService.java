package com.cl9p.controllers;

import com.cl9p.domain.User;
import com.cl9p.exceptions.FindAllUsersConstraintException;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Set;

public class UserService {
    @Autowired
    private User u;

    public @Valid ArrayList<User> findAllUsers() throws FindAllUsersConstraintException {
        ArrayList<User> arrayList = new ArrayList<User>();
        arrayList.add(u);
        return arrayList;
    }
}
