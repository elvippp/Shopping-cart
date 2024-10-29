import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Food meat = new Meat(5, 100);
        Food redApples = new Apple(10, 50, Colour.RED_COLOUR);
        Food greenApples = new Apple(8, 60, Colour.GREEN_COLOUR);

        Food[] foods = new Food[]{meat, redApples, greenApples};

        ShoppingCart sc = new ShoppingCart(foods);

        System.out.println("Общая сумма товаров без скидки: " + sc.getCartPriceWithoutDiscount());

        System.out.println("Общая сумма товаров со скидкой: " + sc.getCartPriceWithDiscount());

        System.out.println("Cуммa всех вегетарианских продуктов без скидки: " + sc.getVegCartPriceWithoutDiscount());
    }
}