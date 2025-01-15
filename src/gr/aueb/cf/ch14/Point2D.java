package src.gr.aueb.cf.ch14;

public class Point2D extends Point{
    private double y;

    public Point2D() {
        // super(); // Ως πρώτη εντολή Καλεί τον default constructor της Point
//        y = 0;
    }

    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point2D(double x) {
        super(x);
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    public String pointToString() {
        return super.pointToString() + "("+ y + ")";
    }
}
