package ch16;

import static java.lang.System.*;
import java.util.*;

public class BoxingExample2 {

    public static void main(String[] args) {
        Random rnd = new Random(currentTimeMillis());
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) //nums.add(new Inetger(rnd.nextInt());
        {
            nums.add(rnd.nextInt());
        }

        Integer sum = new Integer(0);
        //int iSum = 0;
        //for(Integer i : nums)
        //	iSum += i.intValue());
        //sum = new Integer(iSum);
        for (int i : nums) {
            sum += i;
        }

        out.printf("sum%s is %d%n", nums.toString(), sum);
    }
}
