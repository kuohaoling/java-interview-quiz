package com.sinobot.interview.service;

import java.util.List;

import com.sinobot.interview.model.Product;
import com.sinobot.interview.model.User;

public interface UserService {

    void favoriteProduct(User user, Product product);

    List<Product> findFavorites(User user);

}
