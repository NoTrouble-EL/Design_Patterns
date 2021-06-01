package cn.xiaohupao.builder;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/1 22:02
 */
public interface Item {

    /**
     * 获取食物名称
     * @return 食物
     */
    String getName();

    /**
     * 获取包装
     * @return 包装
     */
    Packing packing();

    /**
     * 获取价格
     * @return 价格
     */
    float getPrice();
}
