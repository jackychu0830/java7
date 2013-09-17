package a;

public class StackTraceExample {

    public static void main(String args[]) {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            StackTraceElement ste[] = e.getStackTrace();
            System.out.print("例外產生在 " + ste[0].getClassName() + " 類別的 ");
            System.out.println(ste[0].getMethodName() + " 方法");
            System.out.print("在 " + ste[0].getFileName() + " 檔案中的");
            System.out.println("第 " + ste[0].getLineNumber() + " 行");
            System.out.println("錯誤原因： " + e.getMessage());
        }
    }
}