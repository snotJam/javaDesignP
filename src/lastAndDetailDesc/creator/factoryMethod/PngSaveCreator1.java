package lastAndDetailDesc.creator.factoryMethod;

/**
 * 子类调用父类的属性，只有在方法中调用，而不能直接当做属性进行初始化
 */
public class PngSaveCreator1 extends PicSaveCreator1 {

    public PngSaveCreator1() {
        picSave = new SaveAsPng();
    }

}
