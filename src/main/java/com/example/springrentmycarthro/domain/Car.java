package com.example.springrentmycarthro.domain;


import org.jetbrains.annotations.Contract;

import javax.persistence.*;
 @Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String brand;
    private String model;
    private String type;
    private String description;
    private Enum fuelCategory;
    private String imageUrl;


    public Car(){

    }
     public Car( String brand,String model,String type,String description  , String imageUrl){

     }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel(){ return model;    }

     public void setModel(String model) {
         this.model = model;
     }

     public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Enum getFuelCategory() {
        return fuelCategory;
    }

    public void setFuelCategory(Enum fuelCategory) {
       this.fuelCategory = fuelCategory;
   }
}

