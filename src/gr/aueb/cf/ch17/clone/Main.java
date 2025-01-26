package src.gr.aueb.cf.ch17.clone;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        City athens = new City("Athens");
        City cloneAthens = athens.clone();

        cloneAthens.setDescription("Paris");
        System.out.println(athens);
        System.out.println(cloneAthens);
    }
}
