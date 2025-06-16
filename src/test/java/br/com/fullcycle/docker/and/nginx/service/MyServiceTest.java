package br.com.fullcycle.docker.and.nginx.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MyServiceTest {

    @Autowired
    private MyService myService;

    @Test
    void testSum() {
        // Given
        Integer a = 10;
        Integer b = 20;

        // When
        Integer result = myService.sum(a, b);

        // Then
        assertEquals(30, result, "The sum method should correctly add two integers.");
    }

    @Test
    void testSub() {
        // Given
        Integer a = 20;
        Integer b = 10;

        // When
        Integer result = myService.sub(a, b);

        // Then
        assertEquals(10, result, "The sub method should correctly sub two integers.");
    }
}