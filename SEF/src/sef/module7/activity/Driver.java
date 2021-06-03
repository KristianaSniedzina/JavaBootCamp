package sef.module7.activity;


public class Driver {

    private String name;
    private Moving driversMoving;

//    5.2.Implement Constructor for Driver class with parameter name
	public Driver(String name){ this.name = name; }

//    5.3.
    public void setDriversMoving(Moving driversMoving) {this.driversMoving = driversMoving;}

public void executeMoving(){
    System.out.println("Driver " + this.name + " ");
    driversMoving.drive();
}
}
