package whileDemo;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入考试科目数");
        int num=sc.nextInt();// 5
        int i =1;
        /*用于统计总分*/
        int sum =0;
        /*用于统计最大值*/
        int max=0;
        /*用于统计最小值*/
        int min =100;
        while(i<=num){
            System.out.println("请录入第"+i+"科的分数");
            int score=sc.nextInt();
            sum+=score;
            /*判断最大值*/
            if(max<score){
                max=score;
            }
            /*判断最小值*/
            if(min>score){
                min=score;
            }
            i++;
        }
        System.out.println("总分为:"+sum);
        System.out.println("平均为:"+(sum*1.0/num));
        System.out.println("最高分:"+max);
        System.out.println("最低分:"+min);
    }
}
