package ch13.generic.zoo;

import static java.lang.System.out;
import java.util.*;

public class MyZoo {

    public static void main(String[] args) {
        Zoo<Animal> zoo = new Zoo<Animal>();
        zoo.add(new Lion());
        zoo.add(new Fish());
        zoo.add(new Bird());
        zoo.add(new Ostrich());

        Zoo<Fish> oceanZoo = new Zoo<Fish>();;
        oceanZoo.add(new Fish());
        oceanZoo.add(new Fish());

        //Zoo<String> stringZoo = new Zoo<String>();

        out.printf("There are %d animals.%n", zoo.count());
        Iterator<Animal> it = zoo.iterator();
        while (it.hasNext()) {
            out.println(it.next().getKind());
        }
    }
}
