package decorator;

public class Client {
    public static void main(String[] args) {
        Drinks order = new Caramel();
        System.out.println("当前商品：焦糖咖啡 价格："+order.cost());
        order=new Milk(order);
        System.out.println("当前商品：焦糖咖啡 加一份牛奶 价格："+order.cost());
        order=new Chocolate(order);
        System.out.println("当前商品：焦糖咖啡 加一份牛奶 加一份巧克力 价格："+order.cost());
    }
}
