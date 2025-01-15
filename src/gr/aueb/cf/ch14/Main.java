package src.gr.aueb.cf.ch14;

import src.gr.aueb.cf.ch14.model.Point;
import src.gr.aueb.cf.ch14.model.Teacher;
import src.gr.aueb.cf.ch14.services.CodingFactorySingleton;
import src.gr.aueb.cf.ch14.services.HelloUtil;

public class Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "Ath.", "Androutsos");
        Teacher teacher2 = new Teacher(2, "A.", "Giannoutsou");
        Teacher teacher3 = new Teacher(3, "C.", "Papadopoulos");

        HelloUtil.sayHello();

        Point p1 = Point.getInstance();
        Point p2 = Point.getRandomPoint();

        CodingFactorySingleton cf1;
        cf1 = CodingFactorySingleton.getInstance();
        CodingFactorySingleton cf2 = CodingFactorySingleton.getInstance();

        System.out.println(cf1);
        System.out.println(cf2);

    }
}
