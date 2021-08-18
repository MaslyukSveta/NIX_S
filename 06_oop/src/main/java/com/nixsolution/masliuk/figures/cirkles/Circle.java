package com.nixsolution.masliuk.figures.cirkles;


import com.nixsolution.masliuk.figures.coordinates.DistanceBetweenPoints;
import com.nixsolution.masliuk.figures.coordinates.Point;
import com.nixsolution.masliuk.figures.interfaces.ICircle;

public class Circle implements ICircle {

    private double area;
    private double radius;

    public Circle(Point a, Point b) {
        radius = DistanceBetweenPoints.sizeSide(a, b);
    }

    public double getArea() {
        area = Math.PI * (radius * radius);
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + area +
                '}' + radius;
    }
}
