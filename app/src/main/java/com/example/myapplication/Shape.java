package com.example.myapplication;

public abstract class Shape {
    private int x;
    private int y;
    private String color = "green";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
