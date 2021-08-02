package Day3.demo3;

public class 变量互换 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // 这里添加一堆代码
        // 不止一种写法 尽量尝试使用两种方法完成
        //相减法
//        a -=b;//a=a-b=-10 b=20
//        b = a+b;//10=b a=-10
//        a = b-a;// a=20 b=10
        //借助一个中间变量
        /*int c =a;
        a=b;
        b=c;*/
        //相乘法
//        a *=b;
//        b = a/b;
//        a /= b;
        // 不借助中间变量
        //相加法
//        a += b;// a=30
//        b = a - b;// b=10 30 - 20
//        a -= b;// a=20 30 -10
        //相除法必须用大的除小的, 否则可能出现除0错误
        b /=a;
        a *= b;
        b =a/b;
        System.out.println(a);//20
        System.out.println(b);//10

        //令第一个成为两个的运算结果, 然后使得第二个成为第一个, 最后将第一个解密为第二个
    }
}
