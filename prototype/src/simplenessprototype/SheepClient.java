package simplenessprototype;

import java.math.BigDecimal;

public class SheepClient {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        System.out.println("sheep:"+sheep.hashCode()+" "+sheep);
        System.out.println("sheep1:"+sheep1.hashCode()+" "+sheep1);
        System.out.println("sheep2:"+sheep2.hashCode()+" "+sheep2);
        System.out.println("sheep3:"+sheep3.hashCode()+" "+sheep3);
        System.out.println("sheep4:"+sheep4.hashCode()+" "+sheep4);

        double a=0.1;
        System.out.println(Double.toString(a));
        System.out.println(new BigDecimal(a));
        System.out.println(new BigDecimal(Double.toString(a)));
        System.out.println(new BigDecimal(Double.toString(a)).toString());
        System.out.println(new BigDecimal(Double.toString(a)).doubleValue());
    }
}
