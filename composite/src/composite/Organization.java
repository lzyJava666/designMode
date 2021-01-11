package composite;

import java.util.Map;

/**
 * 组织
 */
public abstract class Organization {
    private String name;
    private String des;

    //默认实现
    protected void add(Organization organization){
        throw new UnsupportedOperationException();
    }

    protected void remove(String name){
        throw new UnsupportedOperationException();
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
