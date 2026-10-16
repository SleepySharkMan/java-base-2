import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> products = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        if (quantity == 0) {
            System.out.println("Количество товара не может быть равным нулю");
            return;
        }

        Integer currentQuantity = products.get(product);

        if (currentQuantity == null) {
            if (quantity > 0) {
                products.put(product, quantity);
                return;
            } else {
                System.out.println("Количество товара не может быть отрицательным");
                return;
            }
        }

        int newQuantity = currentQuantity + quantity;
        if (newQuantity > 0) {
            products.put(product, newQuantity);
        } else if (newQuantity == 0) {
            products.remove(product);
        } else {
            System.out.println("Итоговое количество товара не может быть отрицательным");
        }
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            totalPrice += product.getKey().getPrice() * product.getValue();
        }
        return totalPrice;
    }

    public int getProductCount() {
        int count = 0;
        for (int entry : products.values()) {
            count += entry;
        }
        return count;
    }
}
