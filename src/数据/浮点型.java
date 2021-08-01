package 数据;

public class 浮点型 {

    public static void main(String[] args) {
        int i = 10;
        // 单精度浮点数  小数点后面有7位小数
        float f = 9.123456789123456789f;
        System.out.println(f);
        // 双精度浮点数
        // 也是java中默认存储浮点数的格式
        // 后缀为f  F  告诉java 以float存储一个数据
        double b = 1.123456789123456789;
        System.out.println(b);
        System.out.println(0xFFFFFF / 2);
    }
}