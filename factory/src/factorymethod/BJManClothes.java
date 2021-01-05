package factorymethod;

/**
 * 北京男装品牌类
 */
public class BJManClothes extends Clothes {
    @Override
    public void type() {
        System.out.println("北京男装品牌");
        setName("北京男装品牌");
    }
}
