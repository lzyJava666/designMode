package composite;

/**
 * 专业
 */
public class Profession extends Organization{

    public Profession(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(this.getName()+" "+this.getDes());
    }
}
