package Day4.demo1;

public class 位运算 {
    public static void main(String[] args) {

        /*位运算符在二进制上运算的符号
        <<  左移运算
        >>  右移运算
        //双箭头左右移动高位补符号, 地位补0
        >>> 不带号右移运算
        &   按位与运算
        |   按位或运算
        ^   按位异或运算
        ~   按位取反运算
        */
        int a =-8;//10000000 00000000 00000000 00001000
        /*左移动一位相当于 *2 */
        int b = a << 1;// 00001000 00010000
        System.out.println(b);

        /*右移动一位相当于 /2 */
        int c =a >> 1;// 00001000 00000100
        System.out.println(c);


        /*
        * >>  << 不会移动符号位
        * >>> 移动符号位
        *01000000 00000000 00000000 00000100
        * */
        int d = a >>>1;//
        System.out.println(d);


        int e =8; //00001000
        int f =9; //00001001

        /*& 同为1 则为1 一方为0 则为0*/
        int g = e & f;//00001000
        System.out.println(g);
        /*| 同为0 则为0 一方为1 则为1*/
        int h = e | f;//00001001
        System.out.println(h);

        /*^ 相同即为0 不同即为1 */
        int i = e ^ f;//00000001
        System.out.println(i);

        /*~ */
        int j=~-1;// -3 -2 -1 | 0 1 2 3
        //
        System.out.println(j);



    }
}
