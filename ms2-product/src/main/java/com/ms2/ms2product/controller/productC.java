package com.ms2.ms2product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import com.ms2.ms2product.model.product;
import com.ms2.ms2product.repository.repository;

@RestController
@RequestMapping("/ms-/product")
public class productC {
    Logger logger = LoggerFactory.getLogger(productC.class);
    private repository productR;

    @Autowired
    public productC(repository productR) {
        this.productR = productR;
    }

    @GetMapping("/all")
    Iterable<product> all() {
        logger.info("Trayendo todos los productos");

        return productR.findAll();
    }

    @GetMapping("/{id}")
    product userById(@PathVariable Long id) {
        logger.info("Trayendo un solo producto");
        return productR.findById(id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    product save(@RequestBody product product) {
        logger.info("Guardando producto");
        return productR.save(product);
    }



}
