package com.example.springrentmycarthro.service;

import com.example.springrentmycarthro.domain.Car;
import com.example.springrentmycarthro.domain.Rent;
import com.example.springrentmycarthro.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;

public class RentServiceTest {
    private RentService offer;



    @Test
 public    void doRent_expectNull() {

        Car car =  new Car();
        car.setBrand("Ford");
        User user = new User();
        user.setFirstName("Henk");
        int Price = 0;
        RentService offer = new RentService();

        Rent rent = offer.doRent(user, car, Price);

        assertNull(rent);
    }
}
