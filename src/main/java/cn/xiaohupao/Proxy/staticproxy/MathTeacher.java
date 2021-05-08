package cn.xiaohupao.Proxy.staticproxy;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/8 19:39
 */
public class MathTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("Teach Math!");
    }
}
