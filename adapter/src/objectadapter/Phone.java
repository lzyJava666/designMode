package objectadapter;
/**
 * 适配器模式---消费者
 */
public class Phone {
    public void charge(ITransverter iTransverter) {
        int src = iTransverter.output5V();
        if (src <= 5 && src >= 1) {
            System.out.println("当前电压符合标准，充电中...");
        } else {
            System.out.println("当前电压不符合标准，请购买对应充电头（1-5V），电源断开!");
        }
    }
}
