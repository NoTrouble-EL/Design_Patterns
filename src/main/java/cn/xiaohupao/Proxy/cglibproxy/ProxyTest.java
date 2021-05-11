package cn.xiaohupao.Proxy.cglibproxy;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/11 19:33
 */
public class ProxyTest {
    public static void main(String[] args) {
        /**
         * 目标对象
         */
        MathTeacher mathTeacher = new MathTeacher();

        /**
         * 生成代理对象
         */
        MathTeacher proxy = (MathTeacher)new ProxyTeacher(mathTeacher).getProxy();

        /**
         * 代理对象调用方法
         */
        proxy.teach();
    }
}
