package cn.xiaohupao.builder;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/1 22:07
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float getPrice();
}
