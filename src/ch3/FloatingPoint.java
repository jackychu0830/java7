package ch3;

public class FloatingPoint {

    public static void main(String args[]) {
        float f = 0.0f; //宣告一個float 變數f，並指定初始值為0.0

        System.out.println(f); //將f 的數值輸出到螢幕上
        for (int i = 0; i < 10; i++) //設定一個執行十次的回圈
        {
            f += 0.1f; //迴圈每執行一次，就將f 的數值減掉0.1
            System.out.println(f); //將f 的數值輸出到螢幕上
        }
    }
}