package facade;

/**
 * DVD
 */
public class Dvd {

    private volatile static Dvd instance;

    public static Dvd getInstance() {
        if (instance == null) {
            synchronized (Dvd.class) {
                if (instance == null) {
                    instance = new Dvd();
                }
            }
        }
        return instance;
    }

    public void on(){
        System.out.println("Dvd正在开机...");
    }

    public void off(){
        System.out.println("Dvd正在关机...");
    }

    public void down(){
        System.out.println("下一集");
    }

    public void up(){
        System.out.println("上一集");
    }

    public void anew(){
        System.out.println("重新播放");
    }

    public void pause(){
        System.out.println("暂停");
    }

}
