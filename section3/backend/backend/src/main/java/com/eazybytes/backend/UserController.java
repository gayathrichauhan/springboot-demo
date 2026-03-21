package com.eazybytes.backend;

import com.eazybytes.backend.dto.UserDto;
import org.springframework.web.bind.annotation.*;

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
    public String searchUserWithQueryparams(@RequestParam String name, @RequestParam String gender){

        return "fetched user with query params"+name+"and gender"+gender;
    }


    @GetMapping("/headers")
    public String readRequestHeaders(@RequestHeader("User-Agent") String userAgent,
                                     @RequestHeader(name="User-Location",required = false,defaultValue = "Hyderabad") String userLocation){
        return "received"+userAgent+""+userLocation;
    }
    @PostMapping
    public String createUser(@RequestBody UserDto userDto) {
        return "Created User with the data: " + userDto.toString();
    }
}