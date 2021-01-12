package facade;

/**
 * 爆米花机
 */
public class CornPopper {

    private volatile static CornPopper cornPopper;

    //双重检查
    public static CornPopper getInstance() {
        if (cornPopper == null) {
            synchronized (CornPopper.class) {
                if (cornPopper == null) {
                    cornPopper = new CornPopper();
                }
            }
        }
        return cornPopper;
    }

    public void on(){
        System.out.println("爆米花机正在开机...");
    }

    public void off(){
        System.out.println("爆米花机正在关机...");
    }

    public void make(){
        System.out.println("爆米花机开始制作爆米花..");
    }

    public void calefaction(){
        System.out.println("爆米花机正在加热中...");
    }

}
