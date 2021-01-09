package decorator;

/**
 * 牛奶
 */
public class Milk extends Decorator{

    public Milk(Drinks drinks) {
        super(drinks);
        setPrice(2.0f);
        setName("牛奶");
    }
}
