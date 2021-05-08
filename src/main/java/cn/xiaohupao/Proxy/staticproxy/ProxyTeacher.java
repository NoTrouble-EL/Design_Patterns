package cn.xiaohupao.Proxy.staticproxy;

/**
 * @Author: xiaohupao
 * @Date: 2021/5/8 19:40
 */
public class ProxyTeacher implements Teacher{
    /**
     * 通过组合，在代理类中创建一个实际调用具体的方法
     */
    private Teacher target;
    public ProxyTeacher(Teacher target){
        this.target = target;
    }
    @Override
    public void teach() {
        System.out.println("Teach English!");
        target.teach();
        System.out.println("Teach Chinese!");
    }
}
