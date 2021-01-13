package flyweight;

public class ConcreteWebSite extends WebSite {

    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("用户："+user.getName()+" 在"+type+"上发布了一条新闻");
    }
}
