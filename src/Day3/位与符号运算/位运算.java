package Day3.位与符号运算;
// 无法对byte类型的数进行二进制输出.

public class 位运算 {
    public static void main(String[] args) {

        Integer a = 0B00001111;
        Integer b = 0b00110011;

//        byte a1 = (byte)0B01101100;
//        byte b1 = (byte)0b10011100;
//
//        System.out.println(a1);
//        System.out.println(b1);

        // ~ 取反
        a = ~a;
        b = ~b;
//        // & 与
        a = a&b;
//        // | 或
        b = a|b;
//        // ^ 异或 相同为0, 不同为1
        a = a^b;
        //<< 左移i=乘2i
        a = a<<2;
//        //>> 右移i=除2i取商
        b = b>>2;
        System.out.println(a);
        System.out.println(b);

 //       DecimalFormat 输出固定为8 = new DecimalFormat("00000000");
        String a2 = Integer.toBinaryString(a);
        System.out.println("a2 = " + a2);

        String b2 = Integer.toBinaryString(b);
        System.out.println("b2 = " + b2);

        System.out.println(13>>2);
//        String b2 = Integer.toBinaryString(b);
//        System.out.println("b2 = " + 输出固定为32.format(b2));

//        System.out.printf("在十进制中，num1 = %08B\n", b1);
//        DecimalFormat 输出固定为32 = new DecimalFormat("1111 1111 1111 1111 1111 1111 1001 0011");
//
//        String 字符串a = Integer.toBinaryString(a);
//        Integer 二进制a = Integer.valueOf(字符串a);
//        System.out.println("在二进制中，a = " + 输出固定为32.format(二进制a));
//
//        String 字符串b = Integer.toBinaryString(b);
//        Integer 二进制b = Integer.valueOf(字符串b);
//        System.out.println("在二进制中，b = " + 输出固定为32.format(二进制b));
         // 输出固定长度为8的结果
        //DecimalFormat 输出固定为10 = new DecimalFormat("0000000000");
        // 十进制输出(默认)

    }
}
