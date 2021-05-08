package cn.xiaohupao.Proxy.staticproxy;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/8 19:44
 */
public class ProxyTest {
    public static void main(String[] args) {
        /**
         *需要代理的目标对象
         */
        Teacher mathTeacher = new MathTeacher();
        /**
         *代理对象的创建，并建立代理关系
         */
        ProxyTeacher proxyTeacher = new ProxyTeacher(mathTeacher);

        /**
         * 代理对象执行代理方法
         */
        proxyTeacher.teach();
    }
}
