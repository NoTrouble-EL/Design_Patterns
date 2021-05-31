package cn.xiaohupao.factorymethod;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/31 21:54
 */
public class Client {
    public static void main(String[] args) {
        Factory factoryA = new ProductAFactory();
        Product productA = factoryA.createProduct();
        productA.print();

        Factory factoryB = new ProductBFactory();
        Product productB = factoryB.createProduct();
        productB.print();
    }
}
