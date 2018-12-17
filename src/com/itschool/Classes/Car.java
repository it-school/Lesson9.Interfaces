package com.itschool.Classes;

import com.itschool.Interfaces.IVehicle;

import java.util.Date;

public class Car extends Vehicle
{
    private int passengers;

    public int getPassengers()
    {
        return passengers;
    }

    public void setPassengers(int passengers)
    {
        this.passengers = passengers;
    }

    public Car(String title, int speed, int year, int price, int passengers)
    {
        super(title, speed, year, price);
        this.passengers = (passengers > 1 ? passengers : 2);
    }

    public Car()
    {
        this.setTitle("Car");
    }

    @Override
    public String toString()
    {
        return super.toString() + "\npassengers: " + passengers;
    }
}
