package cn.xiaohupao.builder;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/1 22:20
 */
public class MealBuilder {

    public Meal order1(){
        Meal meal = new Meal();
        meal.addItem(new Burger1());
        meal.addItem(new Drink1());

        return meal;
    }
}
