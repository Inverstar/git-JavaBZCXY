package Day3.字符;

public class 转义字符 {
    public static void main(String[] args) {
        /*转义字符虽然写法上多个符号 存储上认为是单个字符*/
        char c = '\'';
        c = '\\';
        /*横线跳格 对应 tab制表符*/
        c = '\t';
        System.out.println(c);
        System.out.println("a\tfasdfasdf");
        System.out.println("ah\bfasdfasdf");
        System.out.println("ah\rfasdfasdf");
        System.out.println("ah\nfasdfasdf");
    }
}
