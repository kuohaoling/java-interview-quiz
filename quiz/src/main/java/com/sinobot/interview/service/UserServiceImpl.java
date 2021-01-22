package com.sinobot.interview.service;

import java.util.List;

import com.sinobot.interview.model.Product;
import com.sinobot.interview.model.User;
import com.sinobot.interview.repository.ProductRepository;
import com.sinobot.interview.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public UserServiceImpl(UserRepository userRepository, ProductRepository productRepository) {
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void favoriteProduct(User user, Product product) {

    }

    @Override
    public List<Product> findFavorites(User user) {
        return null;
    }

}
