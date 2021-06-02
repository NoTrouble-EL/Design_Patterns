package cn.xiaohupao.chainofresponsibility;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/2 22:12
 */
public class Client {
    public static void main(String[] args) {
        Handler level1 = new Leader();
        Handler level2 = new Boss();
        level1.setNextHandler(level2);

        level1.process(10);
        level1.process(12);
    }
}
