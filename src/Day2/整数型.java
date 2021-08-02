package Day2;

//字节,整型,长短整型
public class 整数型 {
    public static void main(String args[]) {
        // 字节型整数  8位  1字节   256   -128  127
        byte b = 127;
        // 短整型整数  16位 2字节  65536  -32768  23767
        short c = 10;
        // 整数型      32位 4字节  -21亿   21亿   默认存储整数常量的类型
        int i = 10;
        // 长整型      64位 8字节  -21亿   21亿
        long l = 21111111111L;
        System.out.println(b);
        System.out.println(c);
        System.out.println(i);
        System.out.println(l);

    }
}