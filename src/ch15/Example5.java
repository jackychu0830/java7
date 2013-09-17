package ch15;

import static ch15.NewDepartment.*;

public class Example5 {

    enum Jobs {

        ENGINEER, PROGRAMMER, SALES
    };

    public static void main(String[] args) {
        //compareTo
        int i = MARKETING.compareTo(SALES);
        int i2 = MARKETING.compareTo(ENGINEER);
        int i3 = MARKETING.compareTo(MARKETING);
        System.out.printf("MARKETING compare to SALES is %d\n", i);
        System.out.printf("MARKETING compare to ENGINEER is %d\n", i2);
        System.out.printf("MARKETING compare to MARKETING is %d\n", i3);

        //equals
        boolean b = HR.equals(SALES);
        boolean b2 = HR.equals(HR);
        System.out.printf("HR and SALES are equal? %b\n", b);
        System.out.printf("HR and HR are equal? %b\n", b2);

        //getDeclaringClass
        Class c = ENGINEER.getDeclaringClass();
        Class c2 = Jobs.ENGINEER.getDeclaringClass();
        System.out.printf("ENGINEER\'s declaring class is %s\n", c.getName());
        System.out.printf("ENGINEER\'s declaring is %s\n", c2.getName());

        //name
        String s = ENGINEER.name();
        String s2 = ENGINEER.toString();
        System.out.printf("s and s2 are equals? %b\n", s.equals(s2));

        //ordinal
        int j = ENGINEER.ordinal();
        int j2 = HR.ordinal();
        System.out.printf("ENGINEER\'s ordinal is %d\n", j);
        System.out.printf("HR\'s ordinal is %d\n", j2);

        //valueOf
        NewDepartment dept = NewDepartment.valueOf("HR");
        boolean b3 = dept.equals(HR);
        System.out.printf("dept(%s) is HR? %b\n", dept.name(), b3);

        //values
        NewDepartment[] depts = NewDepartment.values();
        System.out.printf("NewDepartment type has %d values, there are %s, %s, %s and %s.\n",
            depts.length, depts[0].name(), depts[1].name(), depts[2].name(), depts[3].name());
    }
}
