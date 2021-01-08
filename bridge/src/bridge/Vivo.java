package bridge;

public class Vivo implements IBrand {
    @Override
    public void start() {
        System.out.println("vivo手机开机中...");
    }

    @Override
    public void close() {
        System.out.println("vivo手机尝试关机中..");
    }

    @Override
    public void call() {
        System.out.println("正在使用void手机拨号..");
    }
}
