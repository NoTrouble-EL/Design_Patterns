package cn.xiaohupao.prototype;

import java.util.Date;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/2 21:00
 */
public class Client {
    public static void main(String[] args) {
        Student lsn  = new Student("576", new Date());
        System.out.println(lsn);
        Student lsnCopy = new Student(lsn);
        System.out.println(lsnCopy);
    }
}
