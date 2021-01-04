package aggregation;
/**
 * 电脑类
 */
public class Computer {
    //键盘和电脑可以拆开
    private Keyboard keyboard;
    //鼠标和电脑可以拆开
    private Mouse mouse;

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
