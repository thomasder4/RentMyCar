package com.example.springrentmycarthro.controller;

import com.example.springrentmycarthro.domain.Car;
import com.example.springrentmycarthro.domain.Rent;
import com.example.springrentmycarthro.domain.User;
import com.example.springrentmycarthro.repository.CarRepository;
import com.example.springrentmycarthro.repository.RentRepository;
import com.example.springrentmycarthro.repository.UserRepository;
import com.example.springrentmycarthro.service.RentService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@RestController
@RequestMapping("/rent")
public class RentController {

   private final UserRepository userRepository;
    private  final  CarRepository carRepository;
    private final RentService rentService;
    private int price;

    public RentController(UserRepository userRepository, CarRepository carRepository,RentService rentService ) {
        this.userRepository = userRepository;
        this.carRepository = carRepository;
        this.rentService = rentService;
    }



 @PostMapping
    public Rent doRent(
            @RequestParam int userId,
            @RequestParam int carId

    )
    {

        User user = userRepository.findById(userId).orElseThrow(IllegalArgumentException::new);
        Car car = carRepository.findById(carId).orElseThrow(IllegalArgumentException::new);
        price = 100;
        Rent rent = rentService.doRent(user,car,price);
        if (rent != null) {
            rentService.save(rent);


        return rent;
    }

    else {
        throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE);
    }
    }

}
