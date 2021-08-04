package ifDemo;

public class Test3 {
    public static void main(String[] args) {
        int month=19;
        if(3<=month && month<=5){
            System.out.println("春季:春眠不觉晓");
        }else if(6<= month && month<= 8){
            System.out.println("夏季:夏天蚊子咬");
        }else if(9<= month && month <=11){
            System.out.println("秋季:秋天一身包");
        }else if(month==12 || month ==1 || month ==2){
            System.out.println("冬天:蚊子死翘翘");
        }else{
            System.out.println("月份有误");
        }
    }
}
