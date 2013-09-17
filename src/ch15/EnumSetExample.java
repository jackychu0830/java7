package ch15;

import static ch15.NewFoods.*;
import java.util.*;

public class EnumSetExample {

    public static void main(String[] args) {
        EnumSet<NewFoods> myFavoriteFoods = EnumSet.of(Pasta, Hamburger, Bread, Rice);

        boolean answer = myFavoriteFoods.contains(Fruit);
        System.out.printf("Do you like eat fruit? %s\n", answer ? "Yes" : "No");
        answer = myFavoriteFoods.contains(Hamburger);
        System.out.printf("Do you like eat hamburger? %s\n", answer ? "Yes" : "No");

        System.out.print("My favorite foods are ");
        for (NewFoods food : myFavoriteFoods) {
            System.out.printf("%s, ", food);
        }
        System.out.println();
    }
}
