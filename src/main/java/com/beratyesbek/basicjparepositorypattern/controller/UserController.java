package com.beratyesbek.basicjparepositorypattern.controller;

import com.beratyesbek.basicjparepositorypattern.model.User;
import com.beratyesbek.basicjparepositorypattern.jparepositoy.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("api/users")
public class UserController {

    private final UserRepository userRepository;


    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        userRepository.save(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(userRepository.findById(id).get());
    }
}
