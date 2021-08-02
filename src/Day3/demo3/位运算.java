package Day3.demo3;

import java.text.DecimalFormat;

public class 位运算 {
    public static void main(String[] args) {
        // 求一个整数变量的2倍的结果
        int i = 100;
        /*黑客代码*/
        int j = i << 1;
        System.out.println(j);


        Integer a = 0B01101100;
        Integer b = 0b10011100;

        DecimalFormat 输出固定为8 = new DecimalFormat("0000 0000");

        String 字符串a = Integer.toBinaryString(a);
        Integer 二进制a = Integer.valueOf(字符串a);
        System.out.println("在二进制中，a = " + 输出固定为8.format(二进制a));

        String 字符串b = Integer.toBinaryString(b);
        Integer 二进制b = Integer.valueOf(字符串b);
        System.out.println("在二进制中，b = " + 输出固定为8.format(二进制b));


        int num1 = a^b;
         // 输出固定长度为8的结果
        //DecimalFormat 输出固定为10 = new DecimalFormat("0000000000");
        // 十进制输出(默认)
        System.out.println("在十进制中，num1 = " + 输出固定为8.format(num1));
        // 二进制输出
        String num1InBinaryStr = Integer.toBinaryString(num1);
        Integer num1InBinaryInt = Integer.valueOf(num1InBinaryStr);
        System.out.println("在二进制中，num1 = " + 输出固定为8.format(num1InBinaryInt));
        // 八进制输出
        String num1InOctalStr = Integer.toOctalString(num1);
        Integer num1InOctalInt = Integer.valueOf(num1InOctalStr);
        System.out.println("在八进制中，num1 = " + 输出固定为8.format(num1InOctalInt));
        // 十六进制输出 如果出现字母就报错了
//        String num1InHexStr = Integer.toHexString(num1);
//        Integer num1InHexInt = Integer.valueOf(num1InHexStr);
//        System.out.println("在十六进制中，num1 = " + 输出固定为8.format(num1InHexInt));

        // 十进制输出(默认)
        System.out.printf("在十进制中，num1 = %08d\n", num1);
        // 八进制输出
        System.out.printf("在八进制中，num1 = %08o\n", num1);
        // 十六进制输出
        System.out.printf("在十六进制中，num1 = %08x\n", num1);
        //System.out.printf("在十六进制中，num1 = %08b\n", num1); //java的printf没有二进制输出
        System.out.println(b);
        System.out.println(a);
    }
}
