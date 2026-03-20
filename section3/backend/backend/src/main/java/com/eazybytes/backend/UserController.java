package com.eazybytes.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/api/dummy/users/{userId}/address/{addressId}")
    public String searchUserPostWithMultiPathVariable(
            @PathVariable Map<String, String> pathVariablesMap) {

        return "fetched user with id: "
                + pathVariablesMap.get("userId")
                + " and address id: "
                + pathVariablesMap.get("addressId");
    }
}