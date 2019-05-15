package lastAndDetailDesc.creator.factoryMethod;

/**
 * 这个对象的实例化是使用了一个抽象方法来声明，我们甚至可以直接声明一个变量
 * 参考一下PicSaveCreator1
 */
public abstract class PicSaveCreator {
    abstract PicSave PicSaveCreate();

    public void save() {
        PicSave picSave = PicSaveCreate();
        picSave.save();
    }

}
