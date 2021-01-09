package decorator;

/**
 * 咖啡类---被修饰的商品
 */
public class Coffee extends Drinks {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
