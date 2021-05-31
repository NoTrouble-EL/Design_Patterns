package cn.xiaohupao.abstractfactory;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/31 22:49
 */
public class Client {
    public static void main(String[] args) {
        createProductBy1 createProductBy1 = new createProductBy1();
        ProductA productA = createProductBy1.createProductA();
        productA.print();

        createProductBy2 createProductBy2 = new createProductBy2();
        ProductB productB = createProductBy2.createProductB();
        productB.print();
    }
}
