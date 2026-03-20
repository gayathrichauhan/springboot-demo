package com.eazybytes.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/dummy/users")
public class UserController {

    @GetMapping("/{userId}/address/{addressId}")
    public String searchUserPostWithMultiPathVariable(
            @PathVariable Map<String, String> pathVariablesMap) {

        return "fetched user with id: "
                + pathVariablesMap.get("userId")
                + " and address id: "
                + pathVariablesMap.get("addressId");
    }
    @GetMapping("/search")
    public String searchUserWithQueryparams(){
        return "fetched user with query params";
    }
}