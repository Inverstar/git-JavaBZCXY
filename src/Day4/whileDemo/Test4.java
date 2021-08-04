package whileDemo;

public class Test4 {
    public static void main(String[] args) {
        int i =1;
        while(i<=100){
            if(i%5==0){
                System.out.print(i+" ");
                if(i%3==0){
                    System.out.println();
                }
            }
            i++;
        }
    }
}
