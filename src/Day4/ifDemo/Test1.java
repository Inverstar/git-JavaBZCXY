package ifDemo;

public class Test1 {
    public static void main(String[] args) {
        /*给定一个整数 判断是奇数还是偶数*/
        int i =16;
        /*
         if else
         语法  if(条件 结果为Boolean类型){
                    分支1
               }else{
                    分支2
               }
               当括号中的条件成立 那么执行分支1的代码
               括号中的条件不成立 那么执行分支2的代码
         */
        if(i%2==0){
            System.out.println("是偶数");
        }else{
            System.out.println("是奇数");
        }
    }
}
