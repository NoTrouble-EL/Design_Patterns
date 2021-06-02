package cn.xiaohupao.prototype;

import java.util.Date;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/2 20:55
 */
public class Student implements Myclone{

    private String name;
    private Date time;

    public Student(String name, Date time) {
        this.name = name;
        this.time = time;
    }

    public Student(Student student){
        this.name = student.name;
        this.time = student.time;
    }

    public String getName() {
        return name;
    }

    public Date getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }


    @Override
    public Object clone() {
        return new Student(this);
    }
}
