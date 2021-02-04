package command;

public class Client {
    public static void main(String[] args) {
        //准备一台电灯和一台电视
        Lamp lamp=new Lamp();
        Tv tv=new Tv();
        //准备一个遥控器
        Jxpra jxpra=new Jxpra();
        // 给遥控器植入命令
        jxpra.setCommand(0,new LampOnCommand(lamp),new LampOffCommand(lamp));
        jxpra.setCommand(1,new TvOnCommand(tv),new TvOffCommand(tv));
        System.out.println("----测试电灯-------");
        jxpra.onButton(0);
        jxpra.offButton(0);
        jxpra.undo();
        System.out.println("----测试电视------");
        jxpra.onButton(1);
        jxpra.undo();
        jxpra.offButton(1);
    }
}
