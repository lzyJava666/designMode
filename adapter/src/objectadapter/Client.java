package objectadapter;

public class Client {
    public static void main(String[] args) {
        new Phone().charge(new CharginhHead(new Power()));
    }
}
