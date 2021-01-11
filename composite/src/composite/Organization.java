package composite;

/**
 * 组织
 */
public abstract class Organization {
    private String name;
    private String des;

    //默认实现
    protected void add(Organization organization){

    }

    protected void remove(String name){

    }

    protected abstract void print();

    public Organization(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
