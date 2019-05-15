package lastAndDetailDesc.creator.factoryMethod;

public class PngSaveCreator extends PicSaveCreator {
    @Override
    PicSave PicSaveCreate() {
        return new SaveAsPng();
    }
}
