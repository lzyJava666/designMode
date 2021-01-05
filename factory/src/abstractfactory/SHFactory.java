package abstractfactory;

public class SHFactory implements abstractClothes {
    @Override
    public Clothes createClothes(String type) {

        Clothes clothes = null;
        switch (type) {
            case "man": {
                clothes = new SHManClothes();
            }
            break;
            case "girl": {
                clothes = new SHGirlClothes();
            }
            break;
        }
        return clothes;

    }
}
