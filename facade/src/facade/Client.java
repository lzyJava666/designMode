package facade;

public class Client {
    public static void main(String[] args) {
        Jxpra jxpra = new Jxpra();
        jxpra.open();
        jxpra.setout();
        jxpra.off();
    }
}
