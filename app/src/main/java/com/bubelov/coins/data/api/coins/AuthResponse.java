package com.bubelov.coins.data.api.coins;

import com.bubelov.coins.domain.User;

import java.util.List;

/**
 * @author Igor Bubelov
 */

public class AuthResponse {
    private User user;

    private String token;

    private List<String> errors;

    public User getUser() {
        return user;
    }

    public String getToken() {
        return token;
    }

    public List<String> getErrors() {
        return errors;
    }
}