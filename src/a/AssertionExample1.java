package a;

public class AssertionExample1 {

    public static void main(String args[]) {
        System.out.println("計算結果：" + calc(2));
        System.out.println("計算結果：" + calc(0));
    }
    
    private static double calc(double d) {
        double ans;
        //經過一些計算...
        ans = 1.0 / d;
        
        return ans;
    }
}