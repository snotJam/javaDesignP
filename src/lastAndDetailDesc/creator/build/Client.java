package lastAndDetailDesc.creator.build;

public class Client {
    public static void main(String[] args) {
        Product product = new Product.Builder()
                .setId("id")
                .setAddress("address")
                .setName("name")
                .setUrl("http://wwww.snot.com")
                .build();
        product.desc();
    }
}
