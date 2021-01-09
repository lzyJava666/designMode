package decorator;

/**
 * 配料--巧克力
 */
public class Chocolate extends Decorator{
    public Chocolate(Drinks drinks) {
        super(drinks);
        setPrice(3.0f);
        setName("巧克力");
    }
}
