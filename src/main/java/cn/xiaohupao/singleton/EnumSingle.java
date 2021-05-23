package cn.xiaohupao.singleton;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/23 20:51
 *
 * 单例模式的实现方式：枚举
 * 特点：使用枚举对象达到单例的效果
 * 优点：实现简洁，无偿地提供了序列化机制，线程安全，抵御反射攻击
 * 缺点：无法继承超类
 */
public enum EnumSingle {
    /**
     *
     */
    INSTANCE;
}
