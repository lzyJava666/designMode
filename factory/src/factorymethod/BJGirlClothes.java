package factorymethod;

/**
 * 北京女装品牌
 */
public class BJGirlClothes extends Clothes {
    @Override
    public void type() {
        System.out.println("北京女装品牌");
        setName("北京女装品牌");
    }
}
