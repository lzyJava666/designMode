    package bridge;

    public class Oppo implements IBrand {
        @Override
        public void start() {
            System.out.println("Oppo手机开机中...");
        }

        @Override
        public void close() {
            System.out.println("Oppo手机尝试关机中..");
        }

        @Override
        public void call() {
            System.out.println("正在使用Oppo手机拨号..");
        }
    }
