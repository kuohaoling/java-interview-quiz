package com.sinobot.interview.controllers;

import com.sinobot.interview.model.Product;
import com.sinobot.interview.responses.UserResponse;
import com.sinobot.interview.service.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserApi {

    private final UserService userService;

    public UserApi(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}/favorites")
    public ResponseEntity<UserResponse> favorites(
            @PathVariable("userId") String userId,
            @RequestBody Product product) {
        return ResponseEntity.ok(new UserResponse());
    }

}
