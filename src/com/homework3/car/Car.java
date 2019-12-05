package com.homework3.car;

import com.homework3.counter.CountObject;
import java.util.Scanner;

public class Car {
    private Boolean isCarWork = false;
    private Boolean isProgramWork = true;
    private Integer carSpeed = 0;
    private final Integer MIN_SPEED = 0;
    private final Integer MAX_SPEED = 80;
    private Integer pickedOption;

    Scanner user = new Scanner(System.in);
    CountObject countObject = new CountObject();

    public Car() {
        countObject.countQuantityObject();
    }

    public void runProgram() throws InterruptedException {
        showMenu();
        while (isProgramWork) {
            pickedOption = user.nextInt();
            if (pickedOption == 1) {
                startEngine();
            } else if (pickedOption == 2) {
                accelerateCar();
            } else if (pickedOption == 3) {
                keepSpeed();
            } else if (pickedOption == 4) {
                reduceSpeed();
            } else if (pickedOption == 5) {
                stopEngine();
            } else if (pickedOption == 6) {
                isProgramWork = false;
            } else {
                System.out.println("You choose wrong number, try again");
            }
        }
    }

    private void showMenu() {
        System.out.println("Your options" + '\n'
                + "1. Start engine" + '\n'
                + "2. Accelerate car" + '\n'
                + "3. Cruise control" + '\n'
                + "4. Reduce speed" + '\n'
                + "5. Stop engine" + '\n'
                + "6. Exit" + '\n');
    }

    private void startEngine() {
        if (!isCarWork) {
            isCarWork = true;
            System.out.println("Engine start: drun drun drun drun drun drun drun" + "   Speed : " + "> " + carSpeed + " km/h <");
        } else {
            System.out.println("Engine is work now");
        }
    }

    private void accelerateCar() throws InterruptedException {
        if (isCarWork) {
            while (carSpeed < MAX_SPEED) {
                Thread.sleep(500);
                carSpeed += 10;
                if (carSpeed < MAX_SPEED) {
                    System.out.println("Speed:  " + "> " + carSpeed + " km/h <");
                } else {
                    System.out.println("Max speed:  " + "> " + MAX_SPEED + " km/h <");
                    carSpeed = MAX_SPEED;
                }
            }
        } else {
            System.out.println("Start engine");
        }
    }

    private void keepSpeed() {
        if (isCarWork) {
            System.out.print("Enter speed what do you want :");
            carSpeed = user.nextInt();
            System.out.println("Cruise control  :  " + "> " + carSpeed + " km/h <");
        } else {
            System.out.println("Start engine");
        }
    }

    private void reduceSpeed() throws InterruptedException {
        if (isCarWork) {
            while (carSpeed > MIN_SPEED) {
                Thread.sleep(500);
                carSpeed -= 10;
                if (carSpeed > MIN_SPEED) {
                    System.out.println("Speed:  " + "> " + carSpeed + " km/h <");
                } else {
                    System.out.println("Stop:  " + "> " + MIN_SPEED + " km/h <");
                    carSpeed = MIN_SPEED;
                    System.out.println("You can stop engine");
                }
            }
        } else {
            System.out.println("Start engine");
        }
    }

    private void stopEngine() {
        if (carSpeed == 0) {
            isCarWork = false;
            System.out.println("Engine isn't work");
        }
    }
}
