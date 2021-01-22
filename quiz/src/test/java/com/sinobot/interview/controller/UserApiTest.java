package com.sinobot.interview.controller;

import com.google.gson.Gson;
import com.sinobot.interview.config.CoreConfiguration;
import com.sinobot.interview.model.Product;
import com.sinobot.interview.model.User;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = UserApi.class)
@ContextConfiguration(classes = CoreConfiguration.class)
class UserApiTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private Gson gson;

    @Test
    void favoriteProductSuccess() throws Exception {
        User user = new User();
        Product product = new Product();
        mockMvc.perform(post("/users/{userId}/favoriteProduct", user.getId())
                .content(gson.toJson(product)))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("*.favorites[0].id").value(product.getId().toString()));
    }
}
