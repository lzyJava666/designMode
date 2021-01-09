package decorator;

/**
 * 饮料类---被修饰者
 */
public abstract class Drinks {
    private float price;
    private String name;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 费用
     */
    public abstract float cost();
}
