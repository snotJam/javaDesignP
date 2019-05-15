package lastAndDetailDesc.creator.singleton;

/**
 * 枚举类和普通类区别不大，就是实例已定，不能外部创建（封装了单一实例）
 * 结合后面的使用，我们甚至可以将这个枚举当做一个数组来看
 */
public enum SingletonEnum {
    SINGLETON_ENUM, SINGLETON_ENUMID("id");             //实例常量需要是第一行声明

    private String id;          //成员属性

    SingletonEnum(){            //无参构造函数

    }

    SingletonEnum(String id) {  //有参构造函数
        this.id = id;
    }
}
