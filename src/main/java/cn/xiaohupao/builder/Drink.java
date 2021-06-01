package cn.xiaohupao.builder;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/1 22:13
 */
public abstract class Drink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float getPrice();
}
