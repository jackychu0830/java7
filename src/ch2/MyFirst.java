//宣告 Java Class 檔案所在的套件(路徑)
package ch2;

//定義一個 public class，名稱為 MyFirst
public class MyFirst {
    //宣告一個方法，名稱為 main，並且有一個 String 陣列參數 args

    public static void main(String args[]) {
        //產生一個 MyFirst 物件 mf
        MyFirst mf = new MyFirst();

        //呼叫 mf 物件所提供的 start 方法
        mf.start();
    }

    //宣告一個方法，名稱為 start
    public void start() {
        //產生一個 累加 物件，並指定初始值為10
        累加 累加物件 = new 累加(10);

        //呼叫累加物件提供的總和方法，並把結果輸出到命令列模式
        System.out.println("結果 = " + 累加物件.總和());
    }
}

//定義一個類別，名稱為 累加
class 累加 {
    //宣告一個 int 變數 iN

    int iN;

    //宣告一個方法，名稱為 累加，並且有一個 int 參數 iN
    public 累加(int iN) {
        //把參數 iN 指定給類別變數 iN
        this.iN = iN;
    }

    //宣告一個方法，名稱為 總和
    public int 總和() {
        //宣告兩個 int 變數，i 和 sum
        int i, sum;

        //指定 sum 變數的內容為 0
        sum = 0;

        //使用一個 for 迴圈，把 1 加到 iN 的總和計算出來
        for (i = 1; i <= iN; i++) {
            sum += i;
        }

        //把最後的結果傳回去
        return sum;
    }
}