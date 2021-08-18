package com.nixsolution.masliuk.figures.triangles;


import com.nixsolution.masliuk.figures.coordinates.DistanceBetweenPoints;
import com.nixsolution.masliuk.figures.coordinates.Point;
import com.nixsolution.masliuk.figures.interfaces.ITriangle;

public class Triangle implements ITriangle {

    private double perimeter;
    private double area;
    private double ab;
    private double bc;
    private double ac;

    public Triangle(Point a, Point b, Point c) {

        this.ab = ab;
        this.bc = bc;
        this.ac = ac;
        ab = DistanceBetweenPoints.sizeSide(a, b);
        bc = DistanceBetweenPoints.sizeSide(b, c);
        ac = DistanceBetweenPoints.sizeSide(a, c);
    }

    public double calculateArea() {

        double p;
        p = perimeter() / 2;
        area = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        return area;
    }

    public double perimeter() {

        perimeter = ab + bc + ac;
        return perimeter;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "area=" + area +
                '}';
    }
}
