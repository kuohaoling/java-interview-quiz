package com.sinobot.interview.service;

import java.util.List;

import com.sinobot.interview.model.Product;
import com.sinobot.interview.model.User;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SimpleService.class)
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    void favoriteProductSuccess() {
        // given a user and a product
        var user = new User();
        Product product = new Product();

        // when a user favorites a product
        userService.favoriteProduct(user, product);

        // then a user favorites a product
        var products = userService.findFavorites(user);
        assertThat(products, hasItem(product));
    }

}
