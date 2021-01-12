package facade;

/**
 * 投影仪
 */
public class Projector {

    private volatile static Projector instance;

    public static Projector getInstance() {
        if (instance == null) {
            synchronized (Projector.class) {
                if (instance == null) {
                    instance = new Projector();
                }
            }
        }
        return instance;
    }

    public void on(){
        System.out.println("投影仪正在开机...");
    }

    public void off(){
        System.out.println("投影仪正在关机...");
    }

}
