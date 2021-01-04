package simplenessfactory;

import java.util.Scanner;

/**
 * 订购衣服
 */
public class OrderClothes {

    //订购衣服
    public OrderClothes() {
        String type;
        do {
            type = systemIn();
            Clothes clothes = ClothesFactory.createClothes(type);
            if (clothes != null) {
                clothes.type();
                clothes.select();
                clothes.take();
                clothes.buy();
            }else{
                break;
            }
        } while (true);
    }

    //获取从键盘上输入的字符串
    public String systemIn() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }


}
