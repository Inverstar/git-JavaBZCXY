package Day3.位与符号运算;

public class long和double的计算 {
    public static void main(String[] args) {
        // -128 127
        long i = 127;
        double j = 127;
        //当数据类型是小于等于int的整数 进行 + - * 的时候 结果默认是int类型
        //如果是大于int类型的变量参与数据学运算 那么以最大的变量的数据类型作为结果类型
        double z = i + j;
         i= (long) (i+j);
        System.out.println(z+"\n"+i);
    }
}
