import java.sql.SQLOutput;

/**
 * 基于静态内部类实现单例模式
 */
public class StaticClassSingleton {
    public static void main(String[] args) {
        MyStaticClassSingleton instance1 = MyStaticClassSingleton.getInstance();
        instance1.setName("测试单例");
        MyStaticClassSingleton instance2 = MyStaticClassSingleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1:" + instance1);
        System.out.println("instance2:" + instance2);
    }
}

class MyStaticClassSingleton{
    private String name;

    @Override
    public String toString() {
        return "MyStaticClassSingleton{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //反正外部new
    private MyStaticClassSingleton(){}
    //静态内部类实现单例模式，在类加载时线程安全
    private static class MyStaticClassSingletonInstance{
        private static final MyStaticClassSingleton SINGLETON=new MyStaticClassSingleton();
    }

    public static MyStaticClassSingleton getInstance(){
        return MyStaticClassSingletonInstance.SINGLETON;
    }

}
