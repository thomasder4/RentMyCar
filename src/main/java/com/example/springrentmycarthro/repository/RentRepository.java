package com.example.springrentmycarthro.repository;

import com.example.springrentmycarthro.domain.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent, Integer> {
}
