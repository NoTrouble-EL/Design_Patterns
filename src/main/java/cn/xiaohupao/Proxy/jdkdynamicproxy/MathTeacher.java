package cn.xiaohupao.Proxy.jdkdynamicproxy;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/8 20:19
 */

/**
 * 目标对象
 */
public class MathTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("Teach Math!");
    }
}
