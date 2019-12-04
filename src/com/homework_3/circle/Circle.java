package com.homework_3.circle;

public class Circle {
    private Double radius;

    public Circle() {
    }

    public Circle(Double radius) {
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
