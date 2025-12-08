package com.gbassServices.project.resources;

import com.gbassServices.project.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Cecília", "cecmail@gmail.com", "0987654321", "40028922");
        return ResponseEntity.ok().body(u);
    }

}
