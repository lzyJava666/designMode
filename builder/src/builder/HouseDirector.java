package builder;

/**
 * 建造者模式指挥者
 */
public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House createHouse(){
        houseBuilder.piling();
        houseBuilder.walls();
        houseBuilder.capping();
        return houseBuilder.build();
    }

}
