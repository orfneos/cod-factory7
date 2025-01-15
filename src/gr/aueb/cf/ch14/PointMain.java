package src.gr.aueb.cf.ch14;

public class PointMain {

    public static void main(String[] args) {

        Point point = new Point();
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();

        dpMovePlus10(point);
        dpMovePlus10(point2D);
        dpMovePlus10(point3D);
    }

    public static void dpMovePlus10(Point point) {
        point.movePlus10();
    }

    public static void doPrint(Point point) {
        System.out.println(point.pointToString());
    }
}
