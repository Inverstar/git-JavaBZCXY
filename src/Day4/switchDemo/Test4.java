package switchDemo;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请录入分数");
        int score =sc.nextInt();
        int grade =score/10;//
        /*判断分数等级*/
        switch (grade){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
                System.out.println("及格");
                break;
            case 7:
                System.out.println("一般");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 9:
            case 10:
                System.out.println("优秀");
                break;
            default:
                System.out.println("分数有误");
        }
        sc.close();
    }
}
