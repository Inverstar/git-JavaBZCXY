package whileDemo;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请录入一个整数");
        int i = sc.nextInt();// 15
        // 2 3 4 5 14
        int num =2;
        /*不要在循环中做输出了 在循环中做标记*/
        boolean flag=true;
        while(num<i){
            if(i%num==0){
                flag=false;
            }
            num++;
        }
        if (flag==true){
            System.out.println("是素数");
        }else{
            System.out.println("不是素数");
        }
        sc.close();
    }
}
