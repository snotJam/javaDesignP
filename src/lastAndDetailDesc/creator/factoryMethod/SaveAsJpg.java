package lastAndDetailDesc.creator.factoryMethod;

public class SaveAsJpg implements PicSave{
    @Override
    public void save() {
        System.out.println("图片保存为jpg");
    }
}
