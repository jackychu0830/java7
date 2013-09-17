package c;

import c.myannotation.Todo;

public class Engineer extends Employee {

    @Override
    public double caculateSalary() {
        return 45000;
    }

    @Todo(owner = "Piggy",
    deadline = "2005/03/14",
    priority = Todo.Priority.HIGH)
    public void programming() {
    }
}
