package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 系
 */
public class Department extends Organization {
    List<Organization> organizations=new ArrayList<>();
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(Organization organization) {
        organizations.add(organization);
    }

    @Override
    protected void remove(String name) {
        for (Organization organization : organizations) {
            if(organization.getName().equals(name)){
                organizations.remove(organization);
                break;
            }
        }
    }

    @Override
    protected void print() {
        System.out.println("-----------------"+this.getName()+"---------------");
        for (Organization organization : organizations) {
            organization.print();
        }
    }
}
