package com.homework3.counter;

public class CountObject {
    private static Integer count = 0;

    public CountObject() {
        count++;
    }

    public void countQuantityObject() {
        count++;
    }

    public void getCount() {
        System.out.println("Quantity object create in this homework  " + count);
    }
}
