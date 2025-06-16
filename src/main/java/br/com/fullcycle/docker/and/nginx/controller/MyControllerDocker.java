package br.com.fullcycle.docker.and.nginx.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/docker")
public class MyControllerDocker {

    @GetMapping
    public ResponseEntity<String> getDockerMessage() {
        var message = "docker is working with java and nginx";
        return ResponseEntity.ok(message);
    }

}
