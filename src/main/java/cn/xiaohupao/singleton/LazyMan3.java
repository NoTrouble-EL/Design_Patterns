package cn.xiaohupao.singleton;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/23 19:29
 *
 * 单例模式的实现方式：懒汉式——双重锁检查DCL
 * 特点：使用volatile关键字保证底层指令执行顺序
 * 优点：在入口处判断null，可以省去每次加锁的耗费，提升性能
 */
public class LazyMan3 {

    private volatile static LazyMan3 lazyMan3;

    private LazyMan3(){}

    public static LazyMan3 getInstance(){
        //第一次判断没有同步块，不会涉及到多线程排队取得对象的问题
        if (lazyMan3 == null){
            synchronized (LazyMan3.class){
                //第二次判断是为了让并发的线程没有机会创建第二个对象的可能
                if (lazyMan3 == null){
                    //不是原子性操作
                    lazyMan3 = new LazyMan3();
                    /**
                     * 1.分配内存空间
                     * 2.执行构造方法，初始化对象
                     * 3.把这个对象指向这个空间
                     *
                     * 这将会导致由指令重排造成的问题，当还没有完成构造时，导致其他线程直接获得未构造的对象
                     * 解决方法：在成员变量上加上关键字volatile防止指令重排
                     */
                }
            }
        }

        return lazyMan3;
    }

}
