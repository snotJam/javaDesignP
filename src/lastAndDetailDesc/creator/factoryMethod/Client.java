package lastAndDetailDesc.creator.factoryMethod;

public class Client {
    public static void main(String[] args) {
        PicSaveCreator creator = new JpgSaveCreator();
        creator.save();

        PicSaveCreator1 creator1 = new PngSaveCreator1();
        creator1.save();
    }
}
