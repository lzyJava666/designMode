package interfaceadapter;

public class Client {
    public static void main(String[] args) {
        MethodImpl method = new MethodImpl() {
            @Override
            public void method1() {
                System.out.println("当前需要用到的method1方法");
            }
        };
        method.method1();
    }
}
