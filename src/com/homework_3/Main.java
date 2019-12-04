package com.homework_3;

import com.homework_3.car.Car;
import com.homework_3.circle.Circle;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(16.0d);
        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Area of circle = " + formatter.format(circle.calculateArea()) + "\n");

        Car audi = new Car();
        try {
            audi.runProgram();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
