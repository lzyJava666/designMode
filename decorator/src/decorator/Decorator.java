package decorator;

/**
 * 修饰者
 */
public class Decorator extends Drinks {

    Drinks drinks;

    public Decorator(Drinks drinks) {
        this.drinks = drinks;
    }


    @Override
    public float cost() {
        return super.getPrice()+drinks.cost();
    }
}
