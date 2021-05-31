package cn.xiaohupao.factorymethod;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/31 21:47
 */
public class ProductBFactory implements Factory{

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
