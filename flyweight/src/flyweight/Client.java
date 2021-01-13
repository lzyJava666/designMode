package flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = WebSiteFactory.getInstance();
        WebSite webSite = webSiteFactory.getWebSite("新闻");
        webSite.use(new User("张伟"));
        WebSite webSite2 = webSiteFactory.getWebSite("CSDN");
        webSite2.use(new User("张伟"));
        System.out.println(webSiteFactory.webSiteSize());
        WebSite webSite3 = webSiteFactory.getWebSite("贴吧");
        webSite3.use(new User("王企鹅"));
        System.out.println(webSiteFactory.webSiteSize());
    }
}
