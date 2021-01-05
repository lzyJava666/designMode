package factorymethod;

/**
 * 北京品牌订购衣服
 */
public class BJOrderClothes extends OrderClothesFactory {

    @Override
    Clothes createClothes(String type) {
        Clothes clothes=null;
        switch (type){
            case "man":{
                clothes=new BJManClothes();
            }
            break;
            case "girl":{
                clothes=new BJGirlClothes();
            }
            break;
        }
        return clothes;
    }
}
