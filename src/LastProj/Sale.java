package LastProj;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;


class Sale {
    private ArrayList<Product> products;
    private ArrayList<Integer> quantities;

    public Sale() {
        products = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        if (quantity > product.getStock()) {
            throw new IllegalArgumentException("Quantidade solicitada excede o estoque disponível.");
        }
        products.add(product);
        quantities.add(quantity);
        product.reduceStock(quantity);
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < products.size(); i++) {
            total += products.get(i).getPrice() * quantities.get(i);
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("--- Recibo ---");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            int quantity = quantities.get(i);
            System.out.printf("%s (x%d) - R$ %.2f\n", product.getName(), quantity, product.getPrice() * quantity);
        }
        System.out.printf("Total: R$ %.2f\n", calculateTotal());
    }
}

