package com.example.springrentmycarthro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Rent {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

   private Date startDate;
   private Date endDate;


    public Rent(){

    }

    public Rent(Integer price, User user, Car car) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   public Date getStartDate(){
       return startDate;
   }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void addrent(Rent rent) {
    }


}
