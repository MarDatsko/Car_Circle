package com.homework3.circle;

import com.homework3.counter.CountObject;

public class Circle {
    private Double radius;
    CountObject countObject = new CountObject();

    public Circle() {
        countObject.countQuantityObject();
    }

    public Circle(Double radius) {
        countObject.countQuantityObject();
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public Double calculateArea(Double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
