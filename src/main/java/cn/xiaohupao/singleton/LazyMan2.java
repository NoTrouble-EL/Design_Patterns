package cn.xiaohupao.singleton;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/23 18:16
 *
 * 单例模式的实现方式：懒汉式——线程安全
 * 特点：在使用的时候才初始化，即懒加载
 * 优点：避免了不必要的初始化，线程安全
 * 缺点：使用synchronized关键字对操作加锁，有一定的性能损耗，每一次获取实例都需要加锁
 */
public class LazyMan2 {

    private static LazyMan2 lazyMan2;

    private LazyMan2(){}

    public synchronized static LazyMan2 getInstance(){
        if (lazyMan2 == null){
            lazyMan2 = new LazyMan2();
        }

        return lazyMan2;
    }
}
