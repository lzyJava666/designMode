package builder;

public class Client {
    public static void main(String[] args) {
        HouseDirector houseDirector=new HouseDirector(new CommonHouse());

        houseDirector.createHouse();

        houseDirector.setHouseBuilder(new Villa());

        houseDirector.createHouse();

    }
}
