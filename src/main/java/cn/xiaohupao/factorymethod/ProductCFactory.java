package cn.xiaohupao.factorymethod;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/31 21:49
 */
public class ProductCFactory implements Factory{
    @Override
    public Product createProduct() {
        return new ProductC();
    }
}
