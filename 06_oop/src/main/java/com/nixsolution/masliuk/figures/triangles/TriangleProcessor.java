package com.nixsolution.masliuk.figures.triangles;

public class TriangleProcessor {

    private double maxArea;

    private Triangle chooseMaxArea;

    private Triangle[] triangles;


    public TriangleProcessor(Triangle[] tri) {
        this.triangles = tri;
    }

    private void chooseMaxMinTriangleParameters(Triangle[] tri) {

        chooseMaxArea = tri[0];

        for (Triangle tmpTriangle : tri) {

            if (tmpTriangle.calculateArea() > maxArea) {
                maxArea = tmpTriangle.calculateArea();
                chooseMaxArea = tmpTriangle;
            }

        }
    }

    public Triangle getMaxArea() {
        chooseMaxMinTriangleParameters(triangles);
        return chooseMaxArea;
    }


}
