/**
 * 饿汉式单例模式（静态常量）实例
 */
public class HungrySingleton1 {
    public static void main(String[] args) {
        MyHungrySingleton1 instance = MyHungrySingleton1.getInstance();
        MyHungrySingleton1 instance1 = MyHungrySingleton1.getInstance();
        System.out.println(instance == instance1);
    }
}

class MyHungrySingleton1{
    //私有化静态方法，反正外部new
    private MyHungrySingleton1(){}

    // 提供一个实例
    private final static MyHungrySingleton1 singleton=new MyHungrySingleton1();

    public static MyHungrySingleton1 getInstance(){
        return singleton;
    }
}
