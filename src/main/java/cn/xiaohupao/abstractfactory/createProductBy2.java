package cn.xiaohupao.abstractfactory;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/31 22:48
 */
public class createProductBy2 implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}
