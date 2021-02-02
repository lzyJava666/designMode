package cglib;

public class Client {
    public static void main(String[] args) {
        Student student=new Student("我去");
        ProxyFactory proxyFactory=new ProxyFactory(student);
        Student proxyInstance = (Student) proxyFactory.getProxyInstance();
        System.out.println(proxyInstance.getName());
    }
}
