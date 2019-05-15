package lastAndDetailDesc.creator.factoryMethod;

/**
 * 这样，子类可以直接在需要的时候使用变量指定具体实现对象，如PngSaveCreator1
 */
public class PicSaveCreator1 {
    protected PicSave picSave;

    public void save() {
        picSave.save();
    }

}
