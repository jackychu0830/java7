package ch15;

public class Example1 {

    public static void main(String[] args) {
        OldEmployee e1 = new OldEmployee();
        e1.setName("Jacky");
        e1.setId(123);
        e1.setDept(OldDepartment.ENGINEER);

        OldEmployee e2 = new OldEmployee();
        e2.setName("Piggy");
        e2.setId(124);
        e2.setDept(-1);
    }
}
