package cn.xiaohupao.singleton;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/23 20:02
 *
 * 单例模式的实现方式：静态内部类
 * 特点：在类内部有一个静态内部类
 * 优点：懒加载，减少无效内存占用。不需要锁也能保证线程安全
 * 缺点：无法传参
 */
public class Holder {

    private static class SingletonHolder{
        private static final Holder HOLDER = new Holder();
    }

    private Holder(){}

    public static Holder getInstance(){
        return SingletonHolder.HOLDER;
    }
}
