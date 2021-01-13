package flyweight;

import java.util.HashMap;

public class WebSiteFactory {

    private HashMap<String,WebSite> webSiteMap=new HashMap<>();

    private static  WebSiteFactory webSiteFactory=new WebSiteFactory();

    public static WebSiteFactory getInstance(){
        return webSiteFactory;
    }

    public WebSite getWebSite(String type){
        WebSite webSite = webSiteMap.get(type);
        if(webSite==null){
            webSite=new ConcreteWebSite(type);
            webSiteMap.put(type,webSite);
        }
        return webSite;
    }

    public int webSiteSize(){
        return webSiteMap.size();
    }

}
