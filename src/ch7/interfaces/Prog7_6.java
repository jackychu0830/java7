package ch7.interfaces;

public class Prog7_6 {

    public static void main(String argv[]) {
        Weapon tank = new Tank();
        Weapon fighter = new Fighter();
        tank.shoot();
        fighter.shoot();
    }
}
