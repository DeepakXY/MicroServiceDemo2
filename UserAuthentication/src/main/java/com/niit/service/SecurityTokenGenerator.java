package com.niit.service;

import com.niit.domain.UserModel;

import java.util.Map;

public interface SecurityTokenGenerator {
    public abstract Map<String, String> generateToken(UserModel user);


}
