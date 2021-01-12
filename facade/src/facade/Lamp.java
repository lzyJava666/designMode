package facade;

/**
 * 灯
 */
public class Lamp {

    private volatile static Lamp instance;

    public static Lamp getInstance() {
        if (instance == null) {
            synchronized (Lamp.class) {
                if (instance == null) {
                    instance = new Lamp();
                }
            }
        }
        return instance;
    }

    public void on(){
        System.out.println("灯已打开...");
    }

    public void off(){
        System.out.println("灯已关闭...");
    }

    public void dark(){
        System.out.println("灯调节至暗模式");
    }

    public void bright(){
        System.out.println("灯调节至亮模式");
    }
}
