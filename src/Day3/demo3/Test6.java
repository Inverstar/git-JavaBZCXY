package demo3;

public class Test6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // 这里添加一堆代码
        // 不止一种写法 尽量尝试使用两种方法完成

        //借助一个中间变量
        /*int c =a;
        a=b;
        b=c;*/

        // 不借助中间变量
        a += b;// a=30
        b = a - b;// b=10 30 - 20
        a -= b;// a=20 30 -10
        System.out.println(a);//5
        System.out.println(b);//3
    }
}
