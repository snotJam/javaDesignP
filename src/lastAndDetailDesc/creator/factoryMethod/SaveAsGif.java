package lastAndDetailDesc.creator.factoryMethod;

public class SaveAsGif implements PicSave {
    @Override
    public void save() {
        System.out.println("图片保存为gif");
    }
}
