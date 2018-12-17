package com.itschool.Classes;

import com.itschool.Interfaces.IVehicle;

import java.util.Date;

public class Plane extends Vehicle
{
    private int maxHeight;

    public int getMaxHeight()
    {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight)
    {
        this.maxHeight = maxHeight;
    }

    public Plane(String title, int speed, int year, int price, int maxHeight)
    {
        super(title, speed, year, price);
        this.maxHeight = (maxHeight > 1000 ? maxHeight : 1000);
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nmaxHeight: " + this.maxHeight;
    }
}
