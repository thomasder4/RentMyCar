package com.example.springrentmycarthro.domain;

import org.junit.jupiter.api.Test;

import java.util.List;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    void getCar_Model_Equal() {
        Car car = new Car();
            car.setModel("Focus");



        assertEquals("Focus", car.getModel());
    }
}


