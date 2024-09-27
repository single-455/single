package com.example.myapplication;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int x, int y, int base, int height) {
        super(x, y);
        this.base = base;
        this.height = height;
        this.color = "green"; 
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}
