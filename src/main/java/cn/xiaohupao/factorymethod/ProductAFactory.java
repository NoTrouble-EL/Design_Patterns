package cn.xiaohupao.factorymethod;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/31 21:46
 */
public class ProductAFactory implements Factory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
