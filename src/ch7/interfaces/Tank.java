package ch7.interfaces;

public class Tank extends Car implements Weapon {

    public void shoot() {
        System.out.println("發射大砲");
    }
}