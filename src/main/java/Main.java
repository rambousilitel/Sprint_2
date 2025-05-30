import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100); // 5 кг по 100 руб
        Apple redApple = new Apple(10, 50, Colour.RED); // 10 кг по 50 руб, скидка 60%
        Apple greenApple = new Apple(8, 60, Colour.GREEN); // 8 кг по 60 руб

        Food[] products = {meat, redApple, greenApple};

        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getTotalVegetarianPriceWithoutDiscount());
    }
}
