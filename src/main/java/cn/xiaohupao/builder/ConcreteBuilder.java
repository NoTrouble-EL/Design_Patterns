package cn.xiaohupao.builder;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/1 22:41
 */
public class ConcreteBuilder extends Builder{

    @Override
    public void buildPartA() {
        product.setPartA("partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("partB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("partC");
    }
}
