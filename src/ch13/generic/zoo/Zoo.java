package ch13.generic.zoo;

import java.util.*;

public class Zoo<AA extends Animal> {

    private List<AA> animals;

    public Zoo() {
        animals = new ArrayList<AA>();
    }

    public void add(AA a) {
        animals.add(a);
    }

    public List<AA> getAllAnimals() {
        return animals;
    }

    public int count() {
        return animals.size();
    }

    public AA getAnimal(int i) {
        return animals.get(i);
    }

    public Iterator<AA> iterator() {
        return animals.iterator();
    }
}
