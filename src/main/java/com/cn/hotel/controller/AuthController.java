package com.cn.hotel.controller;

import com.cn.hotel.dto.JwtRequest;
import com.cn.hotel.dto.JwtResponse;
import com.cn.hotel.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {


    @Autowired
    JwtService jwtService;


    @PostMapping("/login")
    public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest jwtRequest){
        return new ResponseEntity<JwtResponse>(jwtService.login(jwtRequest), HttpStatus.OK);
    }

}
