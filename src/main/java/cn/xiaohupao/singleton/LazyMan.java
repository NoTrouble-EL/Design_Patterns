package cn.xiaohupao.singleton;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/23 17:35
 *
 * 单例模式的实现方式：懒汉式——线程不安全
 * 特点：在使用的时候才初始化，即懒加载
 * 优点：避免了不必要的初始化
 * 缺点：线程不安全
 */

public class LazyMan {

    /**
     * 若要被静态方法所使用，该成员变量也必须为static
     */
    private static LazyMan lazyMan;

    /**
     * 构造方法私有化
     */
    private LazyMan(){}

    /**
     * 公有静态方法来获取对象，公共保证外部能访问；静态保证通过类名来访问。
     * @return 唯一的对象
     */
    public static LazyMan getInstance(){
        if (lazyMan == null){
            lazyMan = new LazyMan();
        }

        return lazyMan;
    }
}
