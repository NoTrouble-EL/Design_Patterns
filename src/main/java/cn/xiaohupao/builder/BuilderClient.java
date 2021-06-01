package cn.xiaohupao.builder;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/1 22:49
 */
public class BuilderClient {
    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Director director = new Director(concreteBuilder);
        Product product = director.build();
        System.out.println(product);
    }
}
