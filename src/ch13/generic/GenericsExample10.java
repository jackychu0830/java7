package ch13.generic;

import java.util.*;

public class GenericsExample10 {

    public static void main(String[] args) {
        List<Integer> data1 = new LinkedList<Integer>();
        data1.add(1);
        data1.add(2);
        data1.add(3);
        sum(data1);

        List<Double> data2 = new LinkedList<Double>();
        data2.add(5.3);
        data2.add(7.6);
        data2.add(4.2);
        sum(data2);
    }

    public static void sum(List<? extends Number> data) {
        double sum = 0.0;
        for (Number num : data) {
            sum += num.doubleValue();
        }

        System.out.printf("SUM%s = %2.1f%n", data.toString(), sum);
    }
}
