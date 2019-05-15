package lastAndDetailDesc.creator.singleton;

import static lastAndDetailDesc.creator.singleton.SingletonEnum.SINGLETON_ENUM;
import static lastAndDetailDesc.creator.singleton.SingletonEnum.SINGLETON_ENUMID;

public class Client {
    public static void main(String[] args){
        //单例这里不做测试了，可以打印对象的hash值验证
        System.out.println(SingletonEnum.values());
        System.out.println(SINGLETON_ENUM.ordinal()+"");    //打印出序数
        System.out.println(SINGLETON_ENUMID);

    }

}
