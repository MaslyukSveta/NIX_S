package com.nixsolution.masliuk.figures;

import java.util.function.Function;


public class Figure {

    private Figure[] figures;

    public Figure(Figure[] figures) {
        this.figures = figures;
    }


    public Figure figureByProperty(Function<Figure, Double> figureDoubleFunction) {
        Figure result = figures[0];

        for (Figure figure : figures) {
            if (figureDoubleFunction.apply(result) > figureDoubleFunction.apply(figure)) {
                result = figure;
            }
        }
        return result;
    }


}
