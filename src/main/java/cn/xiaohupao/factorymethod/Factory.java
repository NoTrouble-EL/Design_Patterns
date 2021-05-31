package cn.xiaohupao.factorymethod;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/31 21:43
 */
public interface Factory {
    /**
     * 创建产品的方法
     * @return 各种产品
     */
    Product createProduct();
}
