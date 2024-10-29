package service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;


    public ShoppingCart(Food[] foods){
        this.foods = foods;
    }

    public double getCartPriceWithoutDiscount()
    {
        double finalprice = 0;
        for (Food food : this.foods) {
            finalprice += (food.getAmount() * food.getPrice());
        }

        return finalprice;
    }

    public double getCartPriceWithDiscount()
    {
        double finalprice = 0;
        for (Food food : this.foods) {
            finalprice += (food.getAmount() * food.getPrice() * (100-food.getDiscount())/100);
        }

        return finalprice;
    }

    public double getVegCartPriceWithoutDiscount()
    {
        double finalprice = 0;
        for (Food food : this.foods) {
            if(food.isVegetarian()) {
                finalprice += (food.getAmount() * food.getPrice());
            }
        }

        return finalprice;
    }
}
