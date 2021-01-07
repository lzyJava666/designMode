package classadapter;

/**
 * 适配器模式---电源类
 */
public class Power {
    private Integer src;

    public int output220V(){
        if(src==null){
            src=220;
        }
        System.out.println("当前电源传出电压:"+src+"V");
        return src;
    }

}
