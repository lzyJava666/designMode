package abstractfactory;

import java.util.Scanner;

public class OrderClothes {
    private abstractClothes abstractClothes;

    public OrderClothes(abstractClothes abstractClothes) {
        setAbstractClothes(abstractClothes);
    }

    private void setAbstractClothes(abstractfactory.abstractClothes abstractClothes) {
        String type;
        while (true) {
            System.out.println("您订购的商品为：");
            type = systemIn();
            Clothes clothes = abstractClothes.createClothes(type);
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

    //获取从键盘上输入的字符串
    private String systemIn() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
