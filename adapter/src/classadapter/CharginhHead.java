package classadapter;

import java.math.BigDecimal;

/**
 * 适配器模式---手机充电头
 */
public class CharginhHead extends Power implements ITransverter {

    @Override
    public int output5V() {
        System.out.println("充电头转正转换电压...");
        int src=super.output220V();
        src=new BigDecimal(src).divide(new BigDecimal("44")).intValue();
        System.out.println("转换成功，当前电压为："+src+"V");
        return src;
    }
}
