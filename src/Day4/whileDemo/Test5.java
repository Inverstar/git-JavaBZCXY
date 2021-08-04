package whileDemo;

public class Test5 {
    public static void main(String[] args) {
        int i =1;
        int j=0;
        while(i<=100){
            if(i%5==0){
                System.out.print(i+" ");
                j++;
                if(j%3==0){
                    System.out.println();
                }
            }
            i++;
        }
    }
}
