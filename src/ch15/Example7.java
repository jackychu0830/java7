package ch15;

import static ch15.OldFoods.*;

public class Example7 {

    public static void main(String[] args) {
        int myFavoriteFoods = Pasta | Hamburger | Bread | Rice;

        boolean answer = (myFavoriteFoods & Fruit) != 0;
        System.out.printf("Do you like eat fruit? %s\n", answer ? "Yes" : "No");
        answer = (myFavoriteFoods & Hamburger) != 0;
        System.out.printf("Do you like eat hamburger? %s\n", answer ? "Yes" : "No");
    }
}
