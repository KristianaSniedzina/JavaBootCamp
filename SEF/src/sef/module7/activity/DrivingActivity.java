package sef.module7.activity;

public class DrivingActivity {

    public static void main(String arg[]){

        Moving m1 = new Car();
        Moving m2 = new Motorcycle();

        Driver d = new Driver("Kristiana Sniedzina");

        d.setDriversMoving(m1);
        d.executeMoving();

        d.setDriversMoving(m2);
        d.executeMoving();

    }

}
