package ch15;

public class Example3 {

    public static void main(String[] args) {
        NewEmployee e1 = new NewEmployee();
        e1.setName("Jacky");
        e1.setId(123);
        e1.setDept(NewDepartment.ENGINEER);

        NewEmployee e2 = new NewEmployee();
        e2.setName("Piggy");
        e2.setId(124);
        e2.setDept(-1);
        e2.setDept("HR");
    }
}
