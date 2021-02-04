package command;

/**
 * 电灯打开命令
 */
public class LampOnCommand implements Command {

    private Lamp lamp;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.on();
    }

    @Override
    public void undo() {
        lamp.off();
    }
}
