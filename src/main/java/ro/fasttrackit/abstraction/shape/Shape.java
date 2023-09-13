package ro.fasttrackit.abstraction.shape;

import java.text.DecimalFormat;

public interface Shape {
    DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.##");
    double calculateArea();
    double calculatePerimeter();

    // Implement a Circle class and a Rectangle class

    default double formatDecimals(double result) {
        return Double.parseDouble(DECIMAL_FORMAT.format(result));
    }
}
