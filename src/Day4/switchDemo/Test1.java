package switchDemo;

public class Test1 {
    public static void main(String[] args) {
        /*
        * switch case
        * switch(变量 非Boolean){
        *   case 变量可能出现的值:
        * }
        * 开关语句
        * */
        /*给定月份 输出季节*/
        int month = 3;
        switch(month){
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("月份有误");
                break;
        }





    }
}
