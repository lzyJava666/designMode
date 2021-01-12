package facade;

/**
 * 遥控器
 */
public class Jxpra {
    private CornPopper cornPopper;
    private Audio audio;
    private Screen screen;
    private Projector projector;
    private Dvd dvd;
    private Lamp lamp;

    public Jxpra() {
        this.cornPopper = CornPopper.getInstance();
        this.audio = Audio.getInstance();
        this.screen = Screen.getInstance();
        this.projector = Projector.getInstance();
        this.dvd = Dvd.getInstance();
        this.lamp = Lamp.getInstance();
    }

    //打开设备
    public void open(){
        cornPopper.on();
        screen.on();
        projector.on();
        audio.on();
        dvd.on();
        lamp.on();
    }

    //准备看电影
    public void setout(){
        cornPopper.make();
        screen.down();
        lamp.dark();
    }

    //关闭设备
    public void off(){
        screen.up();
        cornPopper.off();
        screen.off();
        projector.off();
        audio.off();
        dvd.off();
        lamp.off();
    }
}
