package Day3.小数;

public class 强制转换 {
    public static void main(String[] args) {
        // 从大到小转化的时候 为了尽量避免数据损失
        // 应该让大的变量的值 在小的变量的范围之内
        short s = -128; // 00100100 00001010
        byte b = (byte) s;    // 00001010  -128  127
        System.out.println(b);

        int i = 10; // 00000000 00000000 00000000 00001010
        short j = (short) i;// 00000000 00001010
        System.out.println(j);

        // int  char
        int a = 98;//00000000 00000000 00000000 00001010
        char c = (char) a; //  00000000 00001010 >>> unicode >>>  b
        System.out.println(c);

        // 浮点数和整数强制转换
        double p = 3.1415;
        long l = (long) p;
        System.out.println(l);
    }
}
