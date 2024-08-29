public class Client {
    Adapter adapter;

    public Client(Adapter adapter) {
        this.adapter = adapter;
    }

    public void request() {
        adapter.adapt();
    }
}
