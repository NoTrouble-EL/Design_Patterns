package cn.xiaohupao.Proxy.jdkdynamicproxy;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/8 20:27
 */

/**
 * 测试类
 */
public class ProxyTest {
    public static void main(String[] args) {
        /**
         * 目标对象
         */
        MathTeacher mathTeacher = new MathTeacher();

        /**
         * 生成代理类
         */
        Teacher proxyTeacher = (Teacher) new ProxyTeacher(mathTeacher).getProxy();

        /**
         * 代理类的实例调用方法
         */
        proxyTeacher.teach();
    }
}
