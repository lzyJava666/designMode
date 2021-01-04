/**
 * 饿汉式单例模式（静态代码块）
 */
public class HungrySingleton2 {
    public static void main(String[] args) {
        MyHungrySingleton2 instance1 = MyHungrySingleton2.getInstance();
        MyHungrySingleton2 instance2 = MyHungrySingleton2.getInstance();
        boolean b = instance1 == instance2;
        System.out.println(b);
    }
}

class MyHungrySingleton2{

    private MyHungrySingleton2(){}

    private static MyHungrySingleton2 singleton2;

    static {
        singleton2=new MyHungrySingleton2();
    }

    public static MyHungrySingleton2 getInstance(){
        return singleton2;
    }

}