package ch7.interfaces;

public class Fighter extends Plane implements Weapon {

    public void shoot() {
        System.out.println("發射飛彈");
    }
}