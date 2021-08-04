package Day4.switchDemo;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入年份");
        int year =sc.nextInt();
        System.out.println("请输入月份");
        int month =sc.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(year+"年"+month+"月有31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(year+"年"+month+"月有30天");
                break;
            case 2:
                if(year %4 ==0){
                    System.out.println(year+"年"+month+"月有29天");
                }else{
                    System.out.println(year+"年"+month+"月有28天");
                }
                break;
            default:
                System.out.println("月份有误");
        }
        sc.close();
    }
}
