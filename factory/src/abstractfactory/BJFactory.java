package abstractfactory;

public class BJFactory implements abstractClothes {
    @Override
    public Clothes createClothes(String type) {
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
