package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> finAll(){
        User u = new User(1l, "walisson", "EEEEE.gmail.com", "9999999", "123");
        return ResponseEntity.ok().body(u);
    }

}
