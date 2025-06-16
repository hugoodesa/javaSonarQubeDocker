package br.com.fullcycle.docker.and.nginx.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public Integer sum(Integer a, Integer b) {
        return a + b;
    }

    public Integer sumX(Integer a, Integer b) {
        return (2*a) + b;
    }

    public Integer sub(Integer a, Integer b) {
        return a - b;
    }

    public Integer div(Integer a, Integer b) {
        return a / b;
    }

    public Integer times(Integer a, Integer b) {
        return a * b;
    }

}
