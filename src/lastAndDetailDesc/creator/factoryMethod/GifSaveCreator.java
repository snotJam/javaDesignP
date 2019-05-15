package lastAndDetailDesc.creator.factoryMethod;

public class GifSaveCreator extends PicSaveCreator{
    @Override
    PicSave PicSaveCreate() {
        return new SaveAsGif();
    }
}
