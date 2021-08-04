package demo1;

public class Test3 {
    public static void main(String[] args) {
        /*
        * 条件运算符 java中唯一的一个三目运算 符
        * 条件?值1:值2
        * 做一些简单的逻辑判断
        * */
        int a = false?10:20;
        System.out.println(a);
        int i=10;
        int j=20;
        System.out.println(i>j?i:j);
    }
}
