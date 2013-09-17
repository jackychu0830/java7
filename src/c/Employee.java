package c;

import c.myannotation.Todo;
import c.myannotation.Copyright;
import c.myannotation.InProgress;

@Copyright("Jacky Chu, 2005")
public class Employee {

    public double caculateSalary() {
        return 15000;
    }

    @Todo(owner = "Piggy",
    deadline = "2005/04/01")
    public String getName() {
        return null;
    }

    @InProgress
    public void foo() {
    }
}
