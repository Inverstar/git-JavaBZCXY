package Day3.小数;

public class 强制保留 {
    public static void main(String[] args) {

        double va = 3.999999;
        va = (int)(va*100)/100.0;
        //粗转换, 无四舍五入
        System.out.println(va);

    }
}
