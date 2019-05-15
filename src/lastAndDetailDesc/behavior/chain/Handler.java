package lastAndDetailDesc.behavior.chain;

/**
 * 对一个字符串进行加密处理
 */
public abstract class Handler {
    protected Handler handler;

    public void setHandler(Handler handler) {   //设置当前处理节点对象的后继处理节点对象
        this.handler = handler;
    }

    public abstract void handleRequest(String str);   //当前节点的处理
}
