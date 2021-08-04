package ifDemo;

public class Test2 {
    public static void main(String[] args) {
        /*给定任意整数
        如果是3的倍数  输出乒
        如果是5的倍数  输出乓
        如果是3和5的倍数 输出乒乓
        如果都不是 输入该数字本身
        if(条件1){
            分支1
        }else if(条件2){
            分支2
        }else if(条件3){
            分支3
        }......
        else{
        }
        从上向下按个检查条件是否成立
        如果其中的某一个条件成立了 则执行对应的分支代码 其余条件则不再判断了
        如果所有条件都不成立 那么会自动执行else 中的代码
        */
        int i = 10;
        if(i%15==0){
            System.out.println("乒乓");
        }else if(i%3==0){
            System.out.println("乒");
        }else if(i%5==0){
            System.out.println("乓");
        }else{
            System.out.println(i);
        }

    }
}
