package dynamicproxt;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object object;

    public ProxyFactory(Object object) {
        this.object = object;
    }

    public Object getProxyInstance() {
        /**
         * static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h)
         *  ClassLoader loader：表示当前目标对象使用的类加载器，获取加载器方法固定
         *  Class<?>[] interfaces：目标对象实现的接口类型，使用泛型方法确认类型
         *  InvocationHandler h：事件处理，执行目标对象的方法时，会出发处理器方法
         */
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                (Object proxy, Method method, Object[] args) -> {
                    Object invoke = method.invoke(object, args);
                    return invoke;
                });
    }
}
