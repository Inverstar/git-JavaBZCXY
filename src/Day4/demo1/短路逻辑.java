package Day4.demo1;

public class 短路逻辑 {
    public static void main(String[] args) {
        /*逻辑运算符 运算结果是boolean 类型
        * & 逻辑与运算 并且 多个条件同为true 则为true 一方为false 则为false
        * | 逻辑或运算 或者 多个条件任意一个为true 则为true 全为false才为false
        * && 短路与运算 并且
        * || 短路或运算 或者
        * ^  逻辑异或运算
        * !  逻辑非运算
        * */

        boolean b = 10<20 & 20<30 & 30<40 ;
        System.out.println(b);
        boolean b2 = 10 > 20 | 20 >30 | 30 >40;
        System.out.println(b2);

        // 短路与运算 发现前面的一项结果为false 则后面的条件就不在运算了
        boolean b3 = false && 1/0 >1;
        System.out.println(b3);

        // 短路或运算 发现前面的一项结果为true  则后面的条件就不运算了
        boolean b4 = 10<20 || 1/0>1;
        System.out.println(b4);
        /*以后基本使用短路的与运算和或运算*/

        /*异或运算  ^
        * 相同则为false 不同则为 true
        *  */
        boolean b5 = 10<20 ^ 20>30;
        System.out.println(b5);

        /*逻辑非运算*/
        boolean b6 = (10<20);
        System.out.println(!b6);

    }
}
