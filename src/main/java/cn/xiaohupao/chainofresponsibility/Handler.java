package cn.xiaohupao.chainofresponsibility;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/2 22:06
 */
public abstract class Handler {
    protected Handler nextHandler;
    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }
    public abstract void process(Integer info);
}
