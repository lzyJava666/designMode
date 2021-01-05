package abstractfactory;

/**
 * 上海女装品牌
 */
public class SHGirlClothes extends Clothes {
    @Override
    public void type() {
        System.out.println("上海女装品牌");
        setName("上海女装品牌");
    }
}
