package dynamicproxt;

public class Client {
    public static void main(String[] args) {
        IStudent student=new Student("好啊好啊");
        ProxyFactory proxyFactory=new ProxyFactory(student);
        IStudent istudent = (IStudent) proxyFactory.getProxyInstance();
        System.out.println(istudent.getName());
    }
}
