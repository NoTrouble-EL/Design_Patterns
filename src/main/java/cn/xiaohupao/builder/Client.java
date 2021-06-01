package cn.xiaohupao.builder;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/1 21:46
 */
public class Client {
    public static void main(String[] args) {
        Computer computer1 = new Computer.Builder("Inter", "三星").build();
        System.out.println(computer1);

        Computer computer2 = new Computer.Builder("Inter", "海盗船").setKeyboard("罗技")
                .setDisplay("三星显示器").setUsbCount(4).build();
        System.out.println(computer2);
    }
}
