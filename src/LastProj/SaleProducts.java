package LastProj;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(new Product(1, "Celular", 1200.00, 10));
        inventory.add(new Product(2, "Notebook", 3500.00, 5));
        inventory.add(new Product(3, "Fone de Ouvido", 200.00, 20));
        inventory.add(new Product(4, "Carregador", 50.00, 30));

        System.out.println("Bem-vindo ao sistema de vendas!\n");

        Sale sale = new Sale();
        boolean keepShopping = true;

        while (keepShopping) {
            System.out.println("Produtos Disponíveis:");
            for (Product product : inventory) {
                System.out.println(product);
            }

            System.out.print("Digite o ID do produto que deseja comprar: ");
            int productId = scanner.nextInt();

            Product selectedProduct = null;
            for (Product product : inventory) {
                if (product.getId() == productId) {
                    selectedProduct = product;
                    break;
                }
            }

            if (selectedProduct == null) {
                System.out.println("Produto não encontrado.");
                continue;
            }

            System.out.print("Digite a quantidade desejada: ");
            int quantity = scanner.nextInt();

            try {
                sale.addProduct(selectedProduct, quantity);
                System.out.println("Produto adicionado com sucesso!");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Deseja continuar comprando? (s/n): ");
            String response = scanner.next();
            keepShopping = response.equalsIgnoreCase("s");
        }

        System.out.println("\nFinalizando compra...");
        sale.printReceipt();
        scanner.close();
    }
}
