package ro.fasttrackit.abstraction.shape;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return formatDecimals(Math.PI * Math.pow(radius, 2));
    }

    public double calculatePerimeter() {
        return formatDecimals(2 * Math.PI * radius);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
