package whileDemo;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请录入一个整数");
        int num =sc.nextInt();// 1/10 654321
        while(num!=0){
            System.out.print(num%10);
            num/=10;
        }
        sc.close();
    }
}
