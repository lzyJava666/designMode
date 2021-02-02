package staticproxy;

public class Client {
    public static void main(String[] args) {
        //创建一个需要被代理的对象
        Student student=new Student();
        student.setName("小明");
        IStudent iStudent=student;
        StudentProxy proxy=new StudentProxy(iStudent);
        System.out.println(proxy.getName());
    }
}
