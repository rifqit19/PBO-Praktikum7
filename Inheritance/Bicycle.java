package Inheritance;

public class Bicycle {

    int speed = 0;
    int gear = 0;

    void changeGear(int newValue) {
        gear = gear + newValue;
        System.out.println("Geear: " + gear);
    }

    void speedUp(int increment) {
        speed = speed + increment;
        System.out.println("Speed: " + speed);
    }

}
