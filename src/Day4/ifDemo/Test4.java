package ifDemo;

public class Test4 {
    public static void main(String[] args) {
        /*
        * if语句可以单独使用
        * else 语句不能单独使用 必须依附于某个if
        * if else 大括号可以省略不写
        *    当大括号不写时 仅仅能关联一行代码或者一组代码
        *
        * */
        int i =10;
        if(i>5)
            System.out.println("你好");
        else
            System.out.println("hello");

        System.out.println("程序执行结束");
    }
}
