package br.com.fullcycle.docker.and.nginx.controller;

import br.com.fullcycle.docker.and.nginx.service.MyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/docker")
public class MyControllerDocker {

    private final MyService myService;

    public MyControllerDocker(MyService myService) {
        this.myService = myService;
    }

    @GetMapping
    public ResponseEntity<String> getDockerMessage() {
        var message = "docker is working with java and nginx";
        Integer sum = myService.sum(1, 2);
        Integer sub = myService.sub(2, 1);
        return ResponseEntity.ok(message + " - sum: " + sum + " - sub: " + sub);
    }

}
