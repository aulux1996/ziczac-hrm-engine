package com.npau.ziczac.controllers;

import com.npau.ziczac.controllers.base.BaseController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHTTPRequestController implements BaseController {

    @GetMapping("/echo/ping")
    @CrossOrigin(origins = "*")
    public ResponseEntity<String> ping() {
        return  ResponseEntity.ok("pong");
    }
}
