package com.homework_3.car;

import java.util.Scanner;

public class Car {
    public Boolean isCarWork = false;
    public Integer speedCar = 0;
    public final Integer MIN_SPEED = 0;
    public final Integer MAX_SPEED = 80;
    public Integer chooseUser;

    Scanner user = new Scanner(System.in);

    public void runProgram() throws InterruptedException {
        showMenu();
        while (true) {
            chooseUser = user.nextInt();
            if (chooseUser == 1) {
                startEngine();
            } else if (chooseUser == 2) {
                accelerateCar();
            } else if (chooseUser == 3) {
                keepSpeed();
            } else if (chooseUser == 4) {
                reduceSpeed();
            } else if (chooseUser == 5) {
                stopEngine();
            }
        }
    }

    private void showMenu() {
        System.out.println("Your options" + '\n'
                + "1. Start engine" + '\n'
                + "2. Accelerate car" + '\n'
                + "3. Cruise control" + '\n'
                + "4. Reduce speed" + '\n'
                + "5. Stop engine" + '\n');

    }

    private void startEngine() {
        if (!isCarWork) {
            isCarWork = true;
            System.out.println("Engine start: drun drun drun drun drun drun drun" + "   Speed : " + "> " + speedCar + " km/h <");
        } else {
            System.out.println("Engine is work now");
        }
    }

    private void accelerateCar() throws InterruptedException {
        if (isCarWork) {
            while (speedCar < MAX_SPEED) {
                Thread.sleep(500);
                speedCar += 10;
                if (speedCar < MAX_SPEED) {
                    System.out.println("Speed:  " + "> " + speedCar + " km/h <");
                } else {
                    System.out.println("Max speed:  " + "> " + MAX_SPEED + " km/h <");
                    speedCar = MAX_SPEED;
                }
            }
        } else {
            System.out.println("Start engine");
        }
    }

    private void keepSpeed() {
        if (isCarWork) {
            System.out.print("Enter speed what do you want :");
            speedCar = user.nextInt();
            System.out.println("Cruise control  :  " + "> " + speedCar + " km/h <");
        } else {
            System.out.println("Start engine");
        }
    }

    private void reduceSpeed() throws InterruptedException {
        if (isCarWork) {
            while (speedCar > MIN_SPEED) {
                Thread.sleep(500);
                speedCar -= 10;
                if (speedCar > MIN_SPEED) {
                    System.out.println("Speed:  " + "> " + speedCar + " km/h <");
                } else {
                    System.out.println("Stop:  " + "> " + MIN_SPEED + " km/h <");
                    speedCar = MIN_SPEED;
                    System.out.println("You can stop engine");
                }
            }
        } else {
            System.out.println("Start engine");
        }
    }

    private void stopEngine() {
        if (speedCar == 0) {
            isCarWork = false;
            System.out.println("Engine isn't work");
        }
    }
}
