package cn.xiaohupao.chainofresponsibility;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/2 22:08
 */
public class Leader extends Handler{
    @Override
    public void process(Integer info) {
        if (info > 0 && info < 11){
            System.out.println("Leader! 处理!");
        }else {
            nextHandler.process(info);
        }
    }
}
