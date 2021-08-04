package Day3.位与符号运算;

public class 取余的模运算 {
    public static void main(String[] args) {
        //取余数运算
        System.out.println(23 % 7);// 3 ... 2
        // 模运算对于浮点数仍然有效

        double a = 42310.6543;
        double b = 1;
        double i = (int)((a*10)%(b*10))/10.0;
        double h = a%b;
        //i==h;
        //怎么判断多个数中小数位数最多的是哪个? 最多的位数是多少? 最少的呢?
        //判断一个double数的小数位数
        int k = (int)(a/b);

        System.out.println(h+"\n"+i);
        //k = 2.12;
        System.out.println((a==k*b+h)+"\n"+(k*b+h));
        System.out.println((a-a%b)/b);
    }
}
