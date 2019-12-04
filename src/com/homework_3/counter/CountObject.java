package com.homework_3.counter;

public class CountObject {
    private static Integer count;

    CountObject() {
        count++;
    }

    public Integer getCount() {
        return count;
    }
}
