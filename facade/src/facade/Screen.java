package facade;

/**
 *屏幕
 */
public class Screen {

    private volatile static Screen screen;

    //双重检查
    public static Screen getInstance() {
        if (screen == null) {
            synchronized (Screen.class) {
                if (screen == null) {
                    screen = new Screen();
                }
            }
        }
        return screen;
    }

    public void on(){
        System.out.println("屏幕正在开启...");
    }

    public void off(){
        System.out.println("屏幕正在关闭...");
    }

    public void down(){
        System.out.println("屏幕正在放下...");
    }

    public void up(){
        System.out.println("屏幕正在升起...");
    }

}
