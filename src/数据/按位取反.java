package 数据;

public class 按位取反 {
    //这是补码 取反是对补码取反
    byte a = (byte)0b00000000;
    byte b = (byte)0b11000011;//原码 10111101
    byte c = (byte)0b01010101;
    byte d = (byte)0b10101010;//原码 11010110

    public byte a1 = (byte)~a;
    public byte b1 = (byte)~b;
    public byte c1 = (byte)~c;
    public byte d1 = (byte)~d;

    public static void main(String[] args)
    {
       按位取反 数字 = new 按位取反();
       Byte a2 = Byte.valueOf(数字.b);
       Byte a3 = a2.byteValue();

        System.out.println(a3);
        System.out.println(数字.a+"取反是"+ 数字.a1);
        System.out.println(数字.b+"取反是"+ 数字.b1);
        System.out.println(数字.c+"取反是"+ 数字.c1);
        System.out.println(数字.d+"取反是"+ 数字.d1);
    }
}
