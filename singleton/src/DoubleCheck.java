/**
 * 双重检查单例模式
 */
public class DoubleCheck {
    public static void main(String[] args) {
        MyDoubleCheck instance1 = MyDoubleCheck.getInstance();
        MyDoubleCheck instance2 = MyDoubleCheck.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class MyDoubleCheck{

    private volatile static MyDoubleCheck instance;

    private MyDoubleCheck(){}

    public static MyDoubleCheck getInstance(){
        if(instance==null){
            synchronized (MyDoubleCheck.class){
                if(instance==null){
                    instance=new MyDoubleCheck();
                }
            }
        }
        return instance;
    }
}
