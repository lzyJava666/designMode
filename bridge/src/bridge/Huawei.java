package bridge;

public class Huawei implements IBrand {
    @Override
    public void start() {
        System.out.println("Huawei手机开机中...");
    }

    @Override
    public void close() {
        System.out.println("Huawei手机尝试关机中..");
    }

    @Override
    public void call() {
        System.out.println("正在使用Huawei手机拨号..");
    }
}
