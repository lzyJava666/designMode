package command;

/**
 * 电灯关闭命令
 */
public class LampOffCommand implements Command{
    private Lamp lamp;

    public LampOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.off();
    }

    @Override
    public void undo() {
        lamp.on();
    }
}
