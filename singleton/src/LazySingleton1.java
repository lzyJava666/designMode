/**
 * 懒汉式单例模式（线程不安全）
 */
public class LazySingleton1 {
    public static void main(String[] args) {
        MyLazySingleton1 instance1 = MyLazySingleton1.getInstance();
        MyLazySingleton1 instance2 = MyLazySingleton1.getInstance();
        boolean b = instance1 == instance2;
        System.out.println(b);
    }
}

class MyLazySingleton1{
    private static MyLazySingleton1 singleton;

    private MyLazySingleton1(){}

    public static MyLazySingleton1 getInstance(){
        if(singleton==null){
            singleton=new MyLazySingleton1();
        }
        return singleton;
    }
}
