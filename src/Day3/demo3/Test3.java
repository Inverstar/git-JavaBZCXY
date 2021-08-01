package demo3;

public class Test3 {
    public static void main(String[] args) {
        int i = 1234;
        int g = i % 10;
        int s = i / 10 % 10;
        int b = i / 100 % 10;
        int q = i / 1000;
        System.out.print(g);
        System.out.print(s);
        System.out.print(b);
        System.out.print(q);
    }
}
