package cn.xiaohupao.Proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/8 20:20
 */
public class ProxyTeacher implements InvocationHandler {
    /**
     * 声明代理对象的引用
     */
    Object target;

    /**
     * 注入代理对象
     * @param target 代理对象
     */
    public ProxyTeacher(Object target){
        this.target = target;
    }

    /**
     * 绑定方法定义
     * @param proxy 代理对象
     * @param method 目标对象的方法对象
     * @param args 目标对象的方法的参数值
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = "teach";
        if (methodName.equals(method.getName())) {
            System.out.println("Teach English!");
            method.invoke(target, args);
            System.out.println("Teach Chinese!");
        }
        return null;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }
}
