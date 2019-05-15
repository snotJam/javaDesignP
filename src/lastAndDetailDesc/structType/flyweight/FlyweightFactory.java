package lastAndDetailDesc.structType.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String, Flyweight> map = new HashMap();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = map.get(key);
        if (flyweight == null) {
            flyweight = new ShareFlyweight(key);
            map.put(key, flyweight);
        }
        return flyweight;
    }
}
