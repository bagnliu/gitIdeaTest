import java.util.HashMap;

/**
 * @author bagnliu
 * @create 2020-06-07 12:40
 */
public class dome {
    public static void main(String[] args) {
        new HashMap<>();
        sushu();
        /*int sum = dome.sum(6, 2);
        System.out.println(sum);*/
    }

    /**
     * 方法：一段代码片段可以完成特定的功能并且能重复使用
     * @param a
     * @param b
     */
    public static int sum(int a,int b) {
        int c = a / b;
        System.out.println(a + "/"+ b + "="+ c);
        return c;
    }

    public static void sushu() {
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            System.out.print(i+ " ");
            count++;
            if (count  == 8) {
                System.out.println();
                count=0;
            }
        }
    }
}
