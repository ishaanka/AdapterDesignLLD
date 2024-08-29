public class Adapter {
    Builder builder;

    public Adapter(Builder builder) {
        this.builder = builder;
    }

    public void adapt() {
        this.builder.build();
        System.out.println("Converting Builder logic");
    }
}
