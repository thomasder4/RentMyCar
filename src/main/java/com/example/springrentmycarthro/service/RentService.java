package com.example.springrentmycarthro.service;

import com.example.springrentmycarthro.domain.Car;
import com.example.springrentmycarthro.domain.Rent;
import com.example.springrentmycarthro.domain.User;
import com.example.springrentmycarthro.repository.RentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RentService {


    private RentRepository rentRepository;



    public void PropertyService(RentRepository propertyRepository) {
        this.rentRepository = rentRepository;
    }



    public boolean isAccepted(Integer rentId, Integer price) {
        Rent rent = rentRepository.getById(rentId);
        return isAccepted(price);
    }

    public boolean isAccepted(Integer price) {
        if (price == 0) {
            return false;
        }
        else {
           return true;
        }

    }

    public Rent doRent( User user, Car car, Integer price) {
        if (isAccepted( price)) {
            Rent rent = new Rent(price, user, car);
            rent.addrent(rent);
            return rent;
        } else {
            return null;
        }
    }

    public Optional<Rent> findById(int rentId) {
        return rentRepository.findById(rentId);
    }

    public Rent save(Rent rent) {
        return rentRepository.save(rent);
    }
}




