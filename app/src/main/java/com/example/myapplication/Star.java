package com.example.myapplication;

public class Star extends Shape {
    private double outerRadius;
    private double innerRadius;
    private int points;

    public Star(int x, int y, double outerRadius, double innerRadius, int points) {
        super(x, y);
        this.outerRadius = outerRadius;
        this.innerRadius = innerRadius;
        this.points = points;
    }
}
