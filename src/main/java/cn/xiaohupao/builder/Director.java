package cn.xiaohupao.builder;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/1 22:45
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product build(){

        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();

        return builder.getResult();
    }
}
