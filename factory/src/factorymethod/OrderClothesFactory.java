package factorymethod;

import java.util.Scanner;

/**
 * 订购衣服的工厂类
 */
public abstract class OrderClothesFactory {

    public OrderClothesFactory() {
        String type;
        while (true) {
            System.out.println("您订购的商品为：");
            type = systemIn();
            Clothes clothes = createClothes(type);
            if (clothes != null) {
                clothes.type();
                clothes.select();
                clothes.take();
                clothes.buy();
            } else {
                System.out.println("订购商品结束");
                break;
            }
        }
    }

    abstract Clothes createClothes(String type);

    //获取从键盘上输入的字符串
    public String systemIn() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
