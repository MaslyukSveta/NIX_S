package com.nixsolution.masliuk.figures.squares;

public class SquareProcessor {

    private double maxArea;

    private Square chooseMaxArea;

    private Square[] squares;


    public SquareProcessor(Square[] squares) {
        this.squares = squares;
    }

    private void chooseMaxMinSquareParameters(Square[] squares) {

        chooseMaxArea = squares[0];

        for (Square tmpSquare : squares) {
            if (tmpSquare.area() > maxArea) {
                maxArea = tmpSquare.area();
                chooseMaxArea = tmpSquare;
            }
        }
    }

    public Square getMaxArea() {
        chooseMaxMinSquareParameters(squares);
        return chooseMaxArea;
    }
}
