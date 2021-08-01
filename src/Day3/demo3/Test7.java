package demo3;

public class Test7 {
    public static void main(String[] args) {
        // 求一个整数变量的2倍的结果
        int i = 100;
        /*黑客代码*/
        int j = i << 1;
        System.out.println(j);
        /*普通代码*/
        int z = i * 2;
        System.out.println(z);
        /*2B代码*/
        int a = i;
        int b = i;
        int c = a + b;
        System.out.println(c);
    }
}
