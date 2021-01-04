/**
 * 懒汉式单例模式（同步代码块，线程不安全）
 */
public class LazySingleton3 {
    public static void main(String[] args) {
        MyLazySingleton3 instance1 = MyLazySingleton3.getInstance();
        MyLazySingleton3 instance2 = MyLazySingleton3.getInstance();
        boolean b = instance1 == instance2;
        System.out.println(b);
    }
}

class MyLazySingleton3 {
    private static MyLazySingleton3 singleton;

    private MyLazySingleton3() {
    }

    public static MyLazySingleton3 getInstance() {
        if (singleton == null) {
            synchronized (MyLazySingleton3.class){
                singleton = new MyLazySingleton3();
            }
        }
        return singleton;
    }
}
