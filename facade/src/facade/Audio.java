package facade;

/**
 * 音响
 */
public class Audio {
    private volatile static Audio instance;

    public static Audio getInstance() {
        if (instance == null) {
            synchronized (Audio.class) {
                if (instance == null) {
                    instance = new Audio();
                }
            }
        }
        return instance;
    }

    public void on(){
        System.out.println("音响正在开机...");
    }

    public void off(){
        System.out.println("音响正在关机...");
    }

    public void increase(){
        System.out.println("音响声音已调大");
    }

    public void decrease(){
        System.out.println("音响声音已调小");
    }

    public void mute(){
        System.out.println("音响已静音");
    }
}
