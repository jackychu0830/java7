package ch7.interfaces;

public class Prog7_5 {

    public static void main(String argv[]) {
        Tank tank = new Tank();
        Fighter fighter = new Fighter();
        tank.move();
        tank.shoot();
        fighter.move();
        fighter.shoot();
    }
}
