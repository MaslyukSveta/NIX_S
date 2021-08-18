package com.nixsolution.masliuk.figures.squares;

import com.nixsolution.masliuk.figures.coordinates.DistanceBetweenPoints;
import com.nixsolution.masliuk.figures.coordinates.Point;
import com.nixsolution.masliuk.figures.interfaces.ISquare;

public class Square implements ISquare {

    private double area;
    private double ab;
    private double bc;
    private double cd;
    private double da;

    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Square(Point a, Point b, Point c, Point d) {
        this.ab = ab;
        this.bc = bc;
        this.cd = cd;
        this.da = da;
        ab = DistanceBetweenPoints.sizeSide(a, b);
        bc = DistanceBetweenPoints.sizeSide(b, c);
        cd = DistanceBetweenPoints.sizeSide(c, d);
        da = DistanceBetweenPoints.sizeSide(d, a);
    }

    public double area() {
        area = ab * ab;
        return area;
    }

    @Override
    public String toString() {
        return "Square{" +
                "area=" + area +
                '}';
    }
}
