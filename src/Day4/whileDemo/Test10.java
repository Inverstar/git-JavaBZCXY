package whileDemo;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        int i = 1;
        while(i<=100){
            // 是素数 就输出 不是不输出
            int num =2;
            boolean flag=true;
            while(num<i/2){
                if(i%num==0){
                    flag=false;
                }
                num++;
            }
            if (flag){
                System.out.println(i);
            }
            i++;
        }
    }
}
