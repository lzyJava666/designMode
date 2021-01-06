package builder;

/**
 * 具体建造者---普通房子
 */
public class CommonHouse implements HouseBuilder{
    @Override
    public void piling() {
        System.out.println("普通房子地基为30米");
    }

    @Override
    public void walls() {
        System.out.println("普通房子红砖砌墙");
    }

    @Override
    public void capping() {
        System.out.println("普通房子封顶漏水");
    }
}
