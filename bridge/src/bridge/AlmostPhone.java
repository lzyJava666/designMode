package bridge;

public class AlmostPhone extends AbsPhone {

    public AlmostPhone(IBrand iBrand) {
        super(iBrand);
    }

    @Override
    protected void start() {
        super.start();
        System.out.println("此手机是全面屏手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("此手机是全面屏手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("此手机是全面屏手机");
    }
}
