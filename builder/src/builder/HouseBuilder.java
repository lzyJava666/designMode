package builder;

/**
 * 构建房子的接口---抽象构建者
 */
public interface HouseBuilder {
    House HOUSE=new House();
    void piling();
    void walls();
    void capping();
    default House build(){
        return HOUSE;
    }
}
