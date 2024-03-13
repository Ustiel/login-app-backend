package com.example.loginappbackend.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor
@Setter
@Getter
public class UserInfoResponse {
    private Long id;
    private String username;
    private String name;
    private List<String> roles;
    private String cookie;
}