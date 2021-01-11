package composite;
import java.util.ArrayList;
import java.util.List;

/**
 * 院校
 */
public class Academy extends Organization {

    List<Organization> organizations=new ArrayList<>();

    @Override
    protected void add(Organization organization) {
        organizations.add(organization);
    }

    @Override
    protected void remove(String name) {
        for (Organization organization : organizations) {
            if(organization.getName().equals(name)){
                organizations.remove(this);
                break;
            }
        }
    }

    public Academy(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println("-----------------"+this.getName()+"---------------");
        for (Organization organization : organizations) {
            organization.print();
        }
    }
}
