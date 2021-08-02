package Day3.demo3;

public class 自乘赋值扩展 {
    public static void main(String[] args) {
        byte b = 10;
        // 包含着一个隐形的数据类型的转换
        //b =b+10;// int
        // 不会改变原有变量的数据类型
        // 因为拓展算数运算符不会改变变量的数据类型
        // 那么就需要注意数字的范围不要超过数据类型的范围
        int a = b + b;//哪怕是同类相加都要转成int
        b += 128;//但是自加不会, 不改变原有类型
        //b *= b+3;// b= b*(b+3)
        a = b*b+b*3;
        int k = -118;
        k *= 3.12;
        System.out.println(a%256);
        System.out.println(k);
    }
}
