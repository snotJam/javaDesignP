package lastAndDetailDesc.behavior.chain;

public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(String str) {
        if(str.contains("key")){
            System.out.println("ConcreteHandler3 处理了此问题，进行秘钥加密");
        }else {
            System.out.println("没有正确的加密方式");
        }
    }
}
