package Day3.demo3;

import java.util.Scanner;

public class 倒序输出 {
     int j = 0;
     int k = 0;
    public int 倒序输出数字(int i)
    {
        return 倒序输出数字((long)i,0);// int直接跳转long实现
    }
    public int 倒序输出数字(long i,int k) //传入long型
    {
        int 小数点 = k;
        double g = i;
        if (k!=0)
        {   for(;k!=0;k--)
            g/=10;

            System.out.println(g+"倒叙输出");
        }
        else
            System.out.println(i+"倒叙输出");
        for(j=0;i>0;i/=10)
        {
            System.out.print(i%10);
            j++;
            if(小数点==j)
                System.out.print('.');
        }
        System.out.println();

            System.out.println(g+"是"+j+"位数\n");
        return j;
    }
    public int 倒序输出数字(double i)//明天重构此函数
    {
        System.out.print(i);
        for( k = 0;i%1!=0;i*=10)
        {
            k++;
        }
        //--k; i = i/10;
        System.out.println("有"+k+"位小数");
        System.out.println("将i转换为long="+(long)i);
        return 倒序输出数字((long)i,k);
        //可以使用取余来重构此函数, 累了.下次吧
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double 输入 = input.nextDouble();
        long  i = 4564813555L;
        double h = 151856.156121;
        /*int g = i % 10;
        int s = i / 10 % 10;
        int b = i / 100 % 10;
        int q = i / 1000;*/
        倒序输出 I = new 倒序输出();
        I.倒序输出数字(输入);
        I.倒序输出数字(i,0);
        I.倒序输出数字(h);
//        System.out.print(g);
//        System.out.print(s);
//        System.out.print(b);
//        System.out.print(q);
    }
}
