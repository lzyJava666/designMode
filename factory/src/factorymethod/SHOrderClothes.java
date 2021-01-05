package factorymethod;

/**
 * 上海订购衣服品牌类
 */
public class SHOrderClothes extends OrderClothesFactory {
    @Override
    Clothes createClothes(String type) {
        Clothes clothes=null;
        switch (type){
            case "man":{
                clothes=new SHManClothes();
            }
            break;
            case "girl":{
                clothes=new SHGirlClothes();
            }
            break;
        }
        return clothes;
    }
}
