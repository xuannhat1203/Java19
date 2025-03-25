package BT09;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200),
                new Product("Bàn phím", 50),
                new Product("Chuột", 30),
                new Product("Tai nghe", 80),
                new Product("Màn hình", 200)
        );
        ProductProcessor processor = new ProductProcessorImpl();
        if (processor.hasExpensiveProduct(products)) {
            System.out.println("Các sản phẩm có giá trị lớn hơn 100:");
            products.stream().filter(p -> p.getPrice() > 100).forEach(System.out::println);
        } else {
            System.out.println("Không có sản phẩm đắt tiền");
        }
        double totalValue = processor.calculateTotalValue(products);
        System.out.println("Tổng giá trị của tất cả sản phẩm: " + totalValue);

        System.out.println("Danh sách sản phẩm:");
        ProductProcessor.printProductList(products);
    }
}
