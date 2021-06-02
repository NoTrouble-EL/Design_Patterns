package cn.xiaohupao.prototype;

import java.util.Date;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/2 21:23
 */
public class UserClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date();
        User lsn = new User("lsn", 23, birthday);
        User lsnCopy = (User) lsn.clone();

        System.out.println(lsn);
        System.out.println(lsnCopy);
        birthday.setTime(22131231);
        lsn.setAge(25);
        System.out.println(lsn);
        System.out.println(lsnCopy);
    }
}
