package cn.xiaohupao.builder;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/1 22:22
 */
public class MealClient {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.order1();
        meal.showItem();
    }
}
