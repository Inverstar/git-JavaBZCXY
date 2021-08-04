package ifDemo;

/*笔的路径
* 导入Scanner  导包
* */
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*借笔
        * 创建一个扫描仪对象
        * */
        Scanner sc =new Scanner(System.in);
        /*
        *   使用笔写字
        * 从键盘录入信息
        * */
        /*从键盘接受一个整数*/
        System.out.println("请录入一个整数");
        int b =sc.nextInt();
        System.out.println("您输入的是:"+b);

        /*从键盘接受一个浮点数*/
        System.out.println("请录入一个小数");
        double d =sc.nextDouble();
        System.out.println("您输入的是:"+d);

        /*从键盘接受文字*/
        System.out.println("请输入其他内容");
        String s =sc.next();
        System.out.println("您输入的是:"+s);

        /*释放资源
        关闭扫描仪
         */
        sc.close();

    }
}
