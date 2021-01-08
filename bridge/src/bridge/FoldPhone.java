package bridge;

public class FoldPhone extends AbsPhone {

    public FoldPhone(IBrand iBrand) {
        super(iBrand);
    }

    @Override
    protected void start() {
        super.start();
        System.out.println("此手机是折叠式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("此手机是折叠式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("此手机是折叠式手机");
    }
}
