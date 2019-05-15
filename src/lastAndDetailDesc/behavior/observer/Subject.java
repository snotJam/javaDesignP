package lastAndDetailDesc.behavior.observer;

import java.util.ArrayList;

/**
 * 被观察者，目标对象
 */
public class Subject {
    private ArrayList<MObserver> list = new ArrayList<MObserver>();

    public void attach(MObserver mObserver) {
        list.add(mObserver);
    }

    public void detach(MObserver mObserver) {
        list.remove(mObserver);
    }

    /**
     * 改变的时候触发关联的观察者联动
     */
    public void change() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).update();
        }
    }
}
