package com.nixsolution.masliuk.figures.cirkles;

public class CircleProcessor {

    private double maxArea;

    private Circle chooseMaxArea;

    private Circle[] circles;


    public CircleProcessor(Circle[] circl) {
        this.circles = circl;
    }

    public void sorting() {

        //  Arrays.sort(maxArea, circles);
    }

    private void chooseMaxMinCircleParameters(Circle[] circle) {

        chooseMaxArea = circle[0];

        for (Circle tmpCircles : circle) {
            if (tmpCircles.getArea() > maxArea) {
                maxArea = tmpCircles.getArea();
                chooseMaxArea = tmpCircles;
            }
        }
    }

    public Circle getMaxArea() {
        chooseMaxMinCircleParameters(circles);
        return chooseMaxArea;
    }
}
