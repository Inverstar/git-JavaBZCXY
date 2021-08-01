package Day2;
// 静态成员变量-类变量-不可定义在方法中,可在类中使用
// 类成员可访问类的变量

public class Test2 {
    // 成员变量 至少可以在当前类的所有方法中使用
    static int z = 20;
    int t = 11;

    public static void main(String args[]) {
        // 局部变量 声明在方法中 当前方法内部
        int i = 10;
        System.out.println(i);
        z = 11;
        for (int x = 1; x <= 10; x++) {
            // 局部变量 声明在循环结构内部 仅仅在当前循环内部可以使用
            int y = 10;
            System.out.println(y);
            Test2 test2 = new Test2();
            System.out.println(test2.t);
        }
        System.out.println(z);
    }

    public static void a() {
        System.out.println(z);
    }

}