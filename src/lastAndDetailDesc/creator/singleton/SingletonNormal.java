package lastAndDetailDesc.creator.singleton;

/**
 * 单例模式具体代码
 */
public class SingletonNormal {
    //需要在static方法中返回这个对象，且静态变量是全局唯一的，所以需要是static的
    private static SingletonNormal singletonInstance = null;
    //饿汉式创建方法，直接先创建对象；上面初始为null的是懒汉式创建，在需要的时候再创建
    private static SingletonNormal singletonNormal = new SingletonNormal();

    private SingletonNormal() {

    }

    //获取懒汉式对象
    public static SingletonNormal getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new SingletonNormal();
        }
        return singletonInstance;
    }

    //获取饿汉式对象
    public static SingletonNormal getInstanceE() {
        singletonInstance = new SingletonNormal();
        return singletonInstance;
    }

    /**
     * 懒汉式+双重锁检查
     * 因为懒汉式在检查和创建对象的时候，有可能发生线程调度切换，而造成如A线程判断实例为null，开始创建实例
     * 而B线程此时切换进入，A还未创建出实例，B判断实例为null，也进入创建实例，这样就违背了单一实例
     * 所以需要双重锁检查
     *
     * 加锁如下：A检测为null，进入同步开始创建对象；
     * 此时B线程切换进入，检测为null，想进入发现同步锁，那么就要等待A创建完成后进入代码块
     * 如果没有第二层判断，B依然会创建对象，有了第二层判断，因为A已经创建，那么就不是null了，保证了实例单一
     */
    public static SingletonNormal getInstanceDouble() {
        if (singletonInstance == null) {      //检测是否为null
            synchronized (SingletonNormal.class) {   //进入同步
                if (singletonInstance == null) {    //第二层判断
                    singletonInstance = new SingletonNormal();
                }
            }
        }
        return singletonInstance;
    }


}
