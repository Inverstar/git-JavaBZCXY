package Day3.小数;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class 四舍五入 {
    public static void main(String[] args) {
        // 除法的两端如果是整数 那么结果只保留整数部分
        // 除法的两端任意一段是浮点数 那么结果就以浮点数保存 double
        System.out.println(10 / 3.0);
        // 给定任意一个浮点数
        double value = 3.1465926;//  3.14  3.15
        // 输出 保留两位小数 考虑四舍五入的结果
        System.out.println();

        double x = 89.4545454545;
        String y = String.format("%.2f",x);//返回值为String，结果为四舍五入后的值
        System.out.println(y);

        x = 89.995;
        DecimalFormat df = new DecimalFormat("0.00");//设置小数位数，"0.00" 就是保留两位小数
        y = df.format(x);//返回数据为 String 类型，结果为四舍五入后的值
        System.out.println(y);

        DecimalFormat z = new DecimalFormat("#.##");
        y = z.format(x);
        System.out.println(y);
        /*若是这种写法DecimalFormat df = new DecimalFormat("#.##")，
        则保留小数点后面不为0的两位小数，
        这种写法不能保证保留2为小数，但能保证最后一位数不为0；*/

        double d = 1.000;
        BigDecimal bd=new BigDecimal(d);
        double d1= bd.setScale(2, RoundingMode.valueOf("HALF_UP")).doubleValue();
        System.out.println(d1);
        //使用这种写法若小数点后均为零，则保留一位小数，并且有四舍五入的规则。
    }
}
