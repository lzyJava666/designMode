package builder;

/**
 * 具体建造者---别墅
 */
public class Villa implements HouseBuilder{
    @Override
    public void piling() {
        System.out.println("别墅地基为：10米");
    }

    @Override
    public void walls() {
        System.out.println("别墅砌墙颜色为银色");
    }

    @Override
    public void capping() {
        System.out.println("别墅屋顶已封顶");
    }
}
