package factorymethod;

/**
 * 上海男装品牌类
 */
public class SHManClothes extends Clothes {
    @Override
    public void type() {
        System.out.println("上海男装品牌");
        setName("上海男装品牌");
    }
}
