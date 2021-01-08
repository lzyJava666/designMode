package bridge;

public class Client {
    public static void main(String[] args) {
        AbsPhone vivo = new FoldPhone(new Vivo());
        vivo.start();
        vivo.call();
        vivo.close();
        System.out.println("-------------------");
        FoldPhone oppoFold = new FoldPhone(new Oppo());
        oppoFold.start();
        oppoFold.call();
        oppoFold.close();
        System.out.println("================");
        AlmostPhone huaweiAlmost = new AlmostPhone(new Huawei());
        huaweiAlmost.start();
        huaweiAlmost.call();
        huaweiAlmost.close();
    }
}
