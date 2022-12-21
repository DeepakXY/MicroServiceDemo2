package com.niit.service;

import com.niit.domain.UserModel;
import com.niit.exception.UserAlreadyExistException;
import com.niit.exception.UserNotFoundException;

public interface UserService {
    public abstract UserModel addUser(UserModel user) throws UserAlreadyExistException;

    public abstract UserModel loginCheck(String email, String userPassword) throws UserNotFoundException;

}
