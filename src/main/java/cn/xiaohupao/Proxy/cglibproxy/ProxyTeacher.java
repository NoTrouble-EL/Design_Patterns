package cn.xiaohupao.Proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/11 19:17
 */
public class ProxyTeacher implements MethodInterceptor {
    /**
     * 声明一个代理对象引用
     */
    private Object target;

    /**
     * 注入代理对象
     * @param target 代理对象
     */
    public ProxyTeacher(Object target){
        this.target = target;
    }

    /**
     * 回调方法
     * @param o 代理对象
     * @param method 目标对象的方法对象
     * @param objects 目标对象的方法的参数的值
     * @param methodProxy 代理对象的方法对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        String methodName = "teach";
        if (method.getName().startsWith(methodName)){
            /**
             * 通知、增强
             */
            System.out.println("Teach English!");
            /**
             * 目标对象原来的方法执行
             */
            method.invoke(target, objects);
            System.out.println("Teach Chinese!");
        }
        return null;
    }

    /**
     * 获取代理对象
     * @return 获取代理对象
     */
    public Object getProxy(){
        /**
         * 通过代理对象生成器获取代理对象
         * 设置要生成代理对象的目标对象：目的是生成目标对象的子对象
         * 设置回调方法
         */
        return Enhancer.create(target.getClass(), this);
    }
}
