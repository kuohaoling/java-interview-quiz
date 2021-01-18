package com.sinobot.interview.responses;

import java.util.List;

import com.sinobot.interview.model.Product;
import com.sinobot.interview.model.User;

public class UserResponse {

    private User user;
    private List<Product> favorites;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Product> favorites) {
        this.favorites = favorites;
    }

}
