package cn.xiaohupao.simpleFactory;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/25 21:44
 */
public class ProductSimpleFactory {
    public static Product createProduct(String type){
        if ("A".equals(type)){
            return new ProductA();
        }else {
            return new ProductB();
        }
    }
}
