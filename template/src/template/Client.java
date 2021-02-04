package template;

public class Client {
    public static void main(String[] args) {
        System.out.println("制作花生豆浆");
        SoybeanMilk peanut = new Peanut();
        peanut.template();
        System.out.println("制作红糖豆浆");
        SoybeanMilk brownSugar = new BrownSugar();
        brownSugar.template();
        System.out.println("制作纯豆浆");
        SoybeanMilk pure = new Pure();
        pure.template();
    }
}
