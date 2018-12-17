package com.itschool.Classes;

import com.itschool.Common.Contants;
import com.itschool.Interfaces.IService;
import com.itschool.Interfaces.IVehicle;

import java.util.Date;

public class Vehicle implements IVehicle, IService
{
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    private String title;
    private int speed;
    private int year;
    private int price;



    public Vehicle(String title, int speed, int year, int price)
    {
        this.title = title;
        this.speed = speed;
        this.year = year;
        this.price = price;
    }

    public Vehicle()
    {
        this.title = "";
    }

    @Override
    public void setPrice(int price)
    {
        this.price = (price > 0 ? price : 1);
    }

    @Override
    public int getPrice()
    {
        return this.price;
    }

    @Override
    public void setYear(int year)
    {
        this.year = (year > 1900 ? year : (new Date().getYear()));
    }

    @Override
    public int getYear()
    {
        return this.year;
    }

    @Override
    public void setVelocity(int velocity)
    {
        this.speed = (velocity > 0 ? velocity : 1);
    }

    @Override
    public int getVelocity()
    {
        return this.speed;
    }

    @Override
    public String toString()
    {
        return this.title +
                ":\nspeed: " + this.speed +
                "\nyear: " + this.year +
                "\nprice: " + this.price +
                "\nnext techView: " + this.getNextTechViewDate(Contants.CAR_TECH_PERIOD).toGMTString()
                ;
    }

    @Override
    public Date getNextTechViewDate(int yearsPeriod)
    {
        Date tempDate = new Date();
        tempDate.setYear(this.getYear() + yearsPeriod - 1900);

        return tempDate;
    }
}
