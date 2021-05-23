package cn.xiaohupao.singleton;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/23 17:12
 *
 * 单例模式的实现方式：饿汉式
 * 特点：在类声明的时候即完成了初始化
 * 优点：实现简单，执行效率高，线程安全
 * 缺点：类加载时就初始化，可能占用不必要的内存
 */
public class Hungry {

    /**
     * 若要被静态方法所使用，该成员变量也必须为static
     */
    private static final Hungry HUNGRY = new Hungry();

    /**
     * 构造方法私有化
     */
    private Hungry(){}

    /**
     * 公有静态方法来获取对象，公共保证外部能访问；静态保证通过类名来访问。
     * @return 唯一对象
     */
    public static Hungry getInstance(){
        return HUNGRY;
    }
}
