package com.nixsolution.masliuk.figures.coordinates;

public class DistanceBetweenPoints {


    public static double sizeSide(Point p1, Point p2) {
        double size;
        size = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
        return size;
    }

}
