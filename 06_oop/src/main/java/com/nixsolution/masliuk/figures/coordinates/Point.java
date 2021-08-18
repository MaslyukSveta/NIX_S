package com.nixsolution.masliuk.figures.coordinates;

import com.nixsolution.masliuk.figures.interfaces.IPoint;

public class Point implements IPoint {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

}
