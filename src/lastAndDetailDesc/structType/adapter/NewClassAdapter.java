package lastAndDetailDesc.structType.adapter;

public class NewClassAdapter implements NewClassInterface {
    OldClass oldClass;

    public NewClassAdapter() {

    }

    public NewClassAdapter(OldClass oldClass) {
        this.oldClass = oldClass;
    }

    @Override
    public void skip() {
        oldClass.run();
        oldClass.fly();
    }
}
