import org.omg.SendingContext.RunTime;

/**
 * 通过枚举实现单例模式
 */
public class EnumSingleton {
    public static void main(String[] args) {
        MyEnumSingleton singleton = MyEnumSingleton.SINGLETON;
        MyEnumSingleton singleton2 = MyEnumSingleton.SINGLETON;
        System.out.println(singleton == singleton2);
    }
}

enum MyEnumSingleton{
    SINGLETON;
}
