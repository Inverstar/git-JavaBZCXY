package ifDemo;


import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.println("31天");
        }else if(month==4||month==6||month==9||month==11){
            System.out.println("30天");
        }else if(month ==2){
            if(year %4==0){
                System.out.println("29天");
            }else {
                System.out.println("28天");
            }
        }else{
            System.out.println("月份有误");
        }
        sc.close();

    }
}
