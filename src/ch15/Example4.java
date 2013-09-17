package ch15;

public class Example4 {

    public static void main(String[] args) {
        NewEmployee2 e1 = new NewEmployee2();
        e1.setName("Jacky");
        e1.setId(123);
        e1.setDept(NewDepartment.ENGINEER);

        System.out.println(e1);
    }
}
