package whileDemo;

public class Test7 {
    public static void main(String[] args) {
        int i = 100;
        while(i<1000){
            int g = i%10;
            int s= i/10%10;
            int b =i/100;
            if(g*g*g+s*s*s+b*b*b== i){
                System.out.println(i);
            }
            i++;
        }
    }
}
