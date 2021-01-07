package objectadapter;
import java.math.BigDecimal;
/**
 * 适配器模式---手机充电头
 */
public class CharginhHead implements ITransverter {

    private Power power;

    public CharginhHead(Power power) {
        this.power = power;
    }

    @Override
    public int output5V() {
        System.out.println("充电头转正转换电压...");
        int src = 0;
        if (power != null) {
            src = power.output220V();
            src = new BigDecimal(src).divide(new BigDecimal("44")).intValue();
            System.out.println("转换成功，当前电压为：" + src + "V");
        }
        return src;
    }
}
