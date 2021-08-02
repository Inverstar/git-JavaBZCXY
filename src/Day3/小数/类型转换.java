package Day3.小数;
// 一个字节8位
// 1 byte = 8 bit
public class 类型转换 {
    public static void main(String[] args) {
        /*从小到大,正常转换*/
        byte b = 10;//  0000 1010
        short s = b;// 0000 0000 0000 1010

        System.out.println(s);
        int i = s; // 0000 0000 0000 0000 0000 0000 0000 1010
        System.out.println(i);
        long l = i;// 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 1010
        System.out.println(l);
        float f = l;//
        System.out.println(f);
        double d = f;//
        System.out.println(d);

        char c = 'b';//b >>>unicode >>> 00000000 10101010
        int x = c;// 00000000 00000000  00000000 10101010 >>> 十进制
        System.out.println(x);
    }
}
