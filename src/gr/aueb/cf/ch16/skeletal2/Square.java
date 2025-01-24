package src.gr.aueb.cf.ch16.skeletal2;

import src.gr.aueb.cf.ch16.skeletal.AbstractRectangle;

public class Square extends AbstractRectangle implements ISquare {
    public Square(double width, double height) {
        super(width, height);
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
    }
}
