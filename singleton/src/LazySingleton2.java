/**
 * 懒汉式单例模式（线程安全）
 */
public class LazySingleton2 {
    public static void main(String[] args) {
        MyLazySingleton2 instance1 = MyLazySingleton2.getInstance();
        MyLazySingleton2 instance2 = MyLazySingleton2.getInstance();
        boolean b = instance1 == instance2;
        System.out.println(b);
    }
}

class MyLazySingleton2{
    private static MyLazySingleton2 singleton;

    private MyLazySingleton2(){}

    public static synchronized MyLazySingleton2 getInstance(){
        if(singleton==null){
            singleton=new MyLazySingleton2();
        }
        return singleton;
    }
}
