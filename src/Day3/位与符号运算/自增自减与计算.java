package Day3.位与符号运算;

public class 自增自减与计算 {
    public static void main(String[] args) {
        /*
         * ++ -- 可以放在变量的前面和后面
         * ++ -- 在变量前边 先让变量自增/自减1 然后再使用变量参与运算
         * ++--  在变量后边 先使用变量参与运算 然后再让变量自增/自减1
         * */
        int i = 10;
        int j = 5;
        //   11 +  5 j--
        int b = ++i + j--;
        int a = i++ + --j;// 11 + 3
        System.out.println(i);
        System.out.println(b);
        System.out.println(j);
        System.out.println(a);
    }
}
