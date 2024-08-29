public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter design!");
        Client client = new Client(new Adapter(new Builder()));
        client.request();
    }
}