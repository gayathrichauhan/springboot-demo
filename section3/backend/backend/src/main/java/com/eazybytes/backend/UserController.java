package com.eazybytes.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/dummy/users/{userId}/posts/{postId}")
    public String searchUserPostWithMultiPathVariable(
            @PathVariable Long userId,
            @PathVariable Long postId) {

        return "fetched user with id: " + userId + " postId: " + postId;
    }


}
