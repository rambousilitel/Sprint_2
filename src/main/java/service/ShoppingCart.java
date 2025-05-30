package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food product : products) {
            total += product.getTotalPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food product : products) {
            double discount = 0;
            if (product instanceof Discountable) {
                discount = ((Discountable) product).getDiscount();
            }
            double price = product.getTotalPrice();
            total += price * (1 - discount / 100);
        }
        return total;
    }

    public double getTotalVegetarianPriceWithoutDiscount() {
        double total = 0;
        for (Food product : products) {
            if (product.isVegetarian()) {
                total += product.getTotalPrice();
            }
        }
        return total;
    }
}
