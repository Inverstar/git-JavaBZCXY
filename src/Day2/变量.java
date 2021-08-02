package Day2;

// 变量
public class 变量 {
    public static void main(String args[]) {
        // 声明变量同时赋值
        // = 叫做赋值符号 把右边的值赋值给左边的变量
        // = 右边是一段表达式, 那么会先运算出表达式的结果 然后再赋值
        int i = 10 + 10;
        System.out.println(i);

        // 可以一次性声明多个变量
		/*int a,b,c,d;
		a=1;
		b=2;
		c=3;
		d=4;*/
        int a = 1, b = 2, c = 3, d = 4;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // 变量的值是可以反复修改
        int x = 11;
        System.out.println(x);
        // 变量只要声明一次类型即可 后面直接使用变量 不需要反复声明其类型
        x = 12;
        System.out.println(x);
    }
}