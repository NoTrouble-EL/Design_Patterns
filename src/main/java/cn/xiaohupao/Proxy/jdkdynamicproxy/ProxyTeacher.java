package cn.xiaohupao.Proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/8 20:20
 */
public class ProxyTeacher implements InvocationHandler {
    Object target;
    public ProxyTeacher(Object target){
        this.target = target;
    }

    /**
     * 绑定方法定义
     * @param proxy
     * @param method
     * @param args
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
