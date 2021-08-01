package demo3;

public class Test5 {
    public static void main(String[] args) {
        byte b = 10;
        // 包含着一个隐形的数据类型的转换
        //b =b+10;// int
        // 不会改变原有变量的数据类型
        // 因为拓展算数运算符不会改变变量的数据类型
        // 那么就需要注意数字的范围不要超过数据类型的范围
        b += 128;
        System.out.println(b);
    }
}
