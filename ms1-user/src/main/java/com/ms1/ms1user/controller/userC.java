package com.ms1.ms1user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ms1.ms1user.model.user;
import com.ms1.ms1user.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/ms-/user")
    public class userC {
    Logger logger = LoggerFactory.getLogger(userC.class);
        private repository userR;


        @Autowired
        public userC(repository userR) {
            this.userR = userR;
        }

        @GetMapping("/all")
        Iterable<user> all() {
            logger.info("Trayendo los usuarios");
            return userR.findAll();
        }

        @GetMapping("/{id}")
        user userById(@PathVariable Long id) {
            logger.info("Trayendo usuario");
            return userR.findById(id).orElseThrow(() -> new ResponseStatusException(
                    HttpStatus.NOT_FOUND));
        }

        @PostMapping("/save")
        user save(@RequestBody user user) {
            logger.info("Guardando Usuario");
            return userR.save(user);
        }

    }
