package com.example.caradatabase;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.caradatabase.web.CarController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CardatabaseApplicationTests {
    @Autowired
    private CarController controller;

    @Test
    void contextLoads() {
        assertThat(controller).isNotNull();
    }
}