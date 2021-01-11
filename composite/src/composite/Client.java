package composite;


import org.omg.Messaging.SyncScopeHelper;

public class Client {
    public static void main(String[] args) {
        Organization xuexiao=new Academy("清华大学","北京户口大学");
        Organization xi1=new Department("计算机系","当前最热门的系");
        Organization xi2=new Department("土建与工程系","传统热门大系，学校招牌");
        Organization zhuanye1=new Profession("软件工程","史上最高薪专业");
        Organization zhuanye2=new Profession("网络工程","黑客之家");
        Organization zhuanye3=new Profession("工程造价","你的房子我说的算！");
        Organization zhuanye4=new Profession("设备管理","你懂的！");
        xi1.add(zhuanye1);
        xi1.add(zhuanye2);
        xi2.add(zhuanye3);
        xi2.add(zhuanye4);
        xuexiao.add(xi1);
        xuexiao.add(xi2);
        xuexiao.print();

        System.out.println("--------------------------分割线-------------------------");
        xi2.remove("设备管理");
        xi2.add(new Profession("园林工程","你喜欢绿色吗？"));
        xuexiao.print();
    }
}
