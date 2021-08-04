package Day3.位与符号运算;

public class 自增自减与括号 {
    public static void main(String[] args) {
        int a = 10;//  11  10
        int b = a++;// 10 11
        //       10
        int c = (--b) + (++a);// 23
        //        9   +  12
        int d = (c++) - (a--) + (++b);// 18
        //       21   - 12    + 10
        int e = --d + c++ - ++b + a--;// 40
        //        18 +  22  -11+ 11
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        //()不影响自增自减的运算顺序, 后面依然等计算完成再自增自减, 前面的先自增自减再计算
    }
}
