package abstractfactory;
import java.util.Scanner;
public class ClothesClient {
    public static void main(String[] args) {
        System.out.println("请输入操作模式：\n0：退出订购系统\n1:选择城市");
        String city=new Scanner(System.in).nextLine();
        switch (city){
            case "0":{
                System.exit(0);
            }
            break;
            case "1":{
                System.out.println("请输入城市：");
                String type=new Scanner(System.in).nextLine();
                if(type.equals("北京")){
                    new OrderClothes(new BJFactory());
                }else{
                    new OrderClothes(new SHFactory());
                }
            }
            break;
        }
    }
}
