package Day2;

import java.text.DecimalFormat;

//进制表示与输出 0/0x/0b
public class 进制表示与输出 {
    public static void main(String[] args) {
        //十进制整数，如：99, -500, 0
        int a = 99;
        //八进制整数，要求以 0 开头，如：015   13
        int b = 015;
        //十六进制数，要求 0x 或 0X 开头，如：0x15  21
        int c = 0x15;
        //二进制：要求0b或者0B开头，如：0b11    3
        int d = 0b11;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        int num1 = 25;
        DecimalFormat 输出固定为8 = new DecimalFormat("0000 0000");

        String 字符串a = Integer.toBinaryString(a);
        Integer 二进制a = Integer.valueOf(字符串a);
        System.out.println("在二进制中，a = " + 输出固定为8.format(二进制a));

        String 字符串b = Integer.toBinaryString(b);
        Integer 二进制b = Integer.valueOf(字符串b);
        System.out.println("在二进制中，b = " + 输出固定为8.format(二进制b));
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
        String num1InHexStr = Integer.toHexString(num1);
        Integer num1InHexInt = Integer.valueOf(num1InHexStr);
        System.out.println("在十六进制中，num1 = " + 输出固定为8.format(num1InHexInt));

        // 十进制输出(默认)
        System.out.printf("在十进制中，num1 = %08d\n", num1);
        // 八进制输出
        System.out.printf("在八进制中，num1 = %08o\n", num1);
        // 十六进制输出
        System.out.printf("在十六进制中，num1 = %08x\n", num1);
        //System.out.printf("在十六进制中，num1 = %08b\n", num1); //java的printf没有二进制输出

    }
}