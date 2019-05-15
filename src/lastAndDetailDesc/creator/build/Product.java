package lastAndDetailDesc.creator.build;

public class Product {
    private String id;
    private String address;
    private String name;
    private String url;

    public Product(Builder builder) {
        this.address = builder.address;
        this.id = builder.id;
        this.name = builder.name;
        this.url = builder.url;
    }

    public void desc() {
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.url);
    }


    public static class Builder {
        private String id;
        private String address;
        private String name;
        private String url;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

}
