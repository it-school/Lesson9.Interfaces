package com.itschool;
import com.itschool.Classes.Car;
import com.itschool.Classes.Plane;

public class Main {

    public static void main(String[] args) {
        /*
        Car car = new Car();
        car.setPrice(100000);
        car.setVelocity(200);
        car.setYear(2018);
        car.setPassengers(4);
*/
        Car car1 = new Car("Auto", 250, 2010, 1000000, 5);
        Car car2 = new Car("BMW", 300, 2015, 2000000, 5);
        System.out.println(car1.toString());
        System.out.println(car2);

        Plane plane = new Plane("Su", 2000, 2015, 100000000, 10000);
        System.out.println(plane);

    }
}
