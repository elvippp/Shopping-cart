package model;

public abstract class Food implements Discountable{
    private int amount;
    private double price;
    private boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian)
    {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getPrice(){
        return this.price;
    }

    public int getAmount(){
        return this.amount;
    }

    public boolean isVegetarian(){
        return this.isVegetarian;
    }
}
