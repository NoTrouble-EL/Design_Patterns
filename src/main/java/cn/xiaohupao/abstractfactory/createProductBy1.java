package cn.xiaohupao.abstractfactory;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/31 22:46
 */
public class createProductBy1 implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}
