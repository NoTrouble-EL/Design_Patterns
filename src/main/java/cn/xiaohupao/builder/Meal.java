package cn.xiaohupao.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaohupao
 * @Date: 2021/6/1 22:15
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items){
            cost += item.getPrice();
        }

        return cost;
    }

    public void showItem(){
        for (Item item : items){
            System.out.print("餐品：" + item.getName());
            System.out.print(", 包装：" + item.packing().getPack());
            System.out.print(", 价格：" + item.getPrice());
        }
    }
}
