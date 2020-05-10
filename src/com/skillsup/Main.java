package com.skillsup;

public class Main {

    public static void main(String[] args) {
        var c1 = new Circle(7);
        var r1 = c1.radius();
        System.out.println(r1);
    }
}

class Circle {

    private int radius;

    public Circle(int r) {
        this.radius = r;
    }

    public double radius() {
        return Math.PI * this.radius * this.radius;
    }
}
