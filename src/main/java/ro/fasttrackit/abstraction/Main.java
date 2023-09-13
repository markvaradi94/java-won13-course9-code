package ro.fasttrackit.abstraction;

import ro.fasttrackit.abstraction.shape.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());
    }
}
