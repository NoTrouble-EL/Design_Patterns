package cn.xiaohupao.simpleFactory;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/25 21:47
 */
public class Client {
    public static void main(String[] args) {

        Product productA = ProductSimpleFactory.createProduct("A");
        productA.print();
        Product productB = ProductSimpleFactory.createProduct("B");
        productB.print();
    }
}
