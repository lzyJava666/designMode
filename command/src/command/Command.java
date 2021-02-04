package command;
//抽象命令接口
public interface Command {
    //执行
    void execute();
    //撤销
    void undo();
}
