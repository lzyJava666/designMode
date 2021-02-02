package cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;
public class ProxyFactory implements MethodInterceptor {

    private Object object;

    public ProxyFactory(Object object) {
        this.object = object;
    }

    //返回代理对象
    public Object getProxyInstance(){
        //1.创建一个工具类
        Enhancer enhancer=new Enhancer();
        //2.设置代理的父类
        enhancer.setSuperclass(object.getClass());
        //3.设置回调函数，调用自身
        enhancer.setCallback(this);
        //4.返回创建的子类
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object invoke = method.invoke(object, objects);
        return invoke;
    }
}
