package lastAndDetailDesc.behavior.chain;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String str) {
        if(str.contains("md5")){
            System.out.println("ConcreteHandler1 处理了此问题，进行了md5加密");  //当前处理
        }else {
            handler.handleRequest(str);    //后继处理
        }

    }
}
