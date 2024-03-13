package com.example.loginappbackend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/test")
public class AccessController {

    @GetMapping("/manager")
    public String managerAccess() {
        return "Manager Only Content";
    }

}