package simplenessfactory;

/**
 * 简单工厂类实现
 */
public class ClothesFactory {

    private ClothesFactory(){}

    private static final ClothesFactory CLOTHES_FACTORY=new ClothesFactory();

    public static ClothesFactory getInstance(){
        return CLOTHES_FACTORY;
    }

    //创建衣服工厂
    public static Clothes createClothes(String typeName){

        Clothes clothes=null;
        switch (typeName){
            case "man":{
                clothes=new ManClothes();
                clothes.setName("男装");
            }
            break;
            case "girl":{
                clothes=new GirlClothes();
                clothes.setName("女装");
            }
            break;
        }
        return clothes;
    }

}
