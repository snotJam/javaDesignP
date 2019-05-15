package lastAndDetailDesc.creator.factoryMethod;

public class JpgSaveCreator extends PicSaveCreator{
    @Override
    PicSave PicSaveCreate() {
        return new SaveAsJpg();
    }
}
