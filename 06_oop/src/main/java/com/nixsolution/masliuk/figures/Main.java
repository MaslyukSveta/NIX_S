package com.nixsolution.masliuk.figures;

import com.nixsolution.masliuk.figures.cirkles.Circle;
import com.nixsolution.masliuk.figures.cirkles.CircleProcessor;
import com.nixsolution.masliuk.figures.coordinates.Point;
import com.nixsolution.masliuk.figures.squares.Square;
import com.nixsolution.masliuk.figures.squares.SquareProcessor;
import com.nixsolution.masliuk.figures.triangles.Triangle;
import com.nixsolution.masliuk.figures.triangles.TriangleProcessor;


public class Main {
    public static void main(String[] args) {


        Triangle triangle1 = new Triangle(new Point(1, 1), new Point(3, 3), new Point(1, 3));
        Triangle triangle2 = new Triangle(new Point(2, 2), new Point(5, 2), new Point(5, 6));

        Triangle[] triangles = new Triangle[]{triangle1, triangle2};
        TriangleProcessor processor1 = new TriangleProcessor(triangles);


        Circle circles1 = new Circle(new Point(0, 0), new Point(3, 3));
        Circle circles2 = new Circle(new Point(0, 0), new Point(0, 4));

        Circle[] circles = new Circle[]{circles1, circles2};
        CircleProcessor circleProcessor = new CircleProcessor(circles);


        Square square1 = new Square(new Point(0, 0), new Point(0, 3), new Point(3, 3), new Point(3, 0));
        Square square2 = new Square(new Point(0, 0), new Point(0, 6), new Point(6, 6), new Point(6, 0));

        Square[] squares = new Square[]{square1, square2};
        SquareProcessor squareProcessor = new SquareProcessor(squares);


        System.out.println(processor1.getMaxArea());
        System.out.println(circleProcessor.getMaxArea());
        System.out.println(squareProcessor.getMaxArea());


    }
}
