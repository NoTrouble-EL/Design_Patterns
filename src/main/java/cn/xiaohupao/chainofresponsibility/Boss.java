package cn.xiaohupao.chainofresponsibility;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/2 22:10
 */
public class Boss extends Handler{
    @Override
    public void process(Integer info) {
        System.out.println("Boss! 处理!");
    }
}
