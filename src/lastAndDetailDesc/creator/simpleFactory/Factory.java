package lastAndDetailDesc.creator.simpleFactory;

public class Factory {
    public static Super creatInstance(int type) {
        Super instance = null;
        switch (type) {
            case 1:
                instance = new Sub1();
                break;
            case 2:
                instance = new Sub2();
                break;
        }
        return instance;
    }

}
