package command;

/**
 * 遥控器类---执行命令者
 */
public class Jxpra {
    //开命令数组
    private Command[] onCommands;
    //关命令数组
    private Command[] offCommands;
    //撤销命令
    private Command undoCommand;

    private static final int SIZE = 3;

    //初始化
    public Jxpra() {
        onCommands = new Command[SIZE];
        offCommands = new Command[SIZE];
        undoCommand = new NoCommand();
        for (int i = 0; i < SIZE; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给遥控器设置命令
    public void setCommand(int index, Command onCommand, Command offCommand) {
        if (onCommand != null) {
            onCommands[index] = onCommand;
        } else {
            onCommands[index] = new NoCommand();
        }
        if (offCommand != null) {
            offCommands[index] = offCommand;
        } else {
            offCommands[index] = new NoCommand();
        }
    }

    //打开按钮
    public void onButton(int index) {
        onCommands[index].execute();
        undoCommand = onCommands[index];
    }

    //关闭按钮
    public void offButton(int index) {
        offCommands[index].execute();
            undoCommand = offCommands[index];
    }

    //撤销按钮
    public void undo() {
        undoCommand.undo();
    }


}
