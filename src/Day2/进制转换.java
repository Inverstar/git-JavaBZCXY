package Day2;

//进制转换 0/0x/0b
public class 进制转换 {
    public static void main(String args[]) {
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
    }
}