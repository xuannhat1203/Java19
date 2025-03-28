package BT09;

import java.util.List;
interface ProductProcessor {
    double calculateTotalValue(List<Product> products);
    static void printProductList(List<Product> products) {
        for (Product product : products) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
    }
    default boolean hasExpensiveProduct(List<Product> products) {
        for (Product product : products) {
            if (product.getPrice() >100){
                return true;
            }
        }
        return false;
    }
}