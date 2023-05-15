package com.mycompany.guiacolec_6.Service;

import com.mycompany.guiacolec_6.entities.Product;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class ProductService {

    int i = 0;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> products = new HashMap();

    /**
     * The metod asks the user for the name and price of the product, finaly creates a Product´s object.
     *
     * @return a object of class Product
     */
    public Product createProduct() {
        System.out.println("Enter the product´s name:");
        String[] productNames = {"bread", "milk", "eggs", "cheese", "yogurt", "chicken", "beef", "fish", "rice", "pasta"};
        String name = productNames[i];
        System.out.println(name);
//        String name = sc.next();
        System.out.println("Enter the product´s price:");
        Double[] productPrices = {2.50, 1.25, 2.00, 4.50, 1.75, 8.99, 12.50, 6.75, 3.25, 2.99};
        Double price = productPrices[i];
        System.out.println(price);
//        Double price = sc.nextDouble();
        i++;
        return new Product(price, name);
    }

    /**
     *
     * This method populates a HashMap using the createProduct method. It asks
     * if you want to continue adding products and ends when the character 'y'
     * is entered.
     */
    public void fillMapProducts() {
        char op;
        do {
            Product aux = createProduct();
            products.put(aux.getName(), aux.getPrice());
            do {
                System.out.println("Do you want to continue adding products?(Y/N)");
                op = sc.next().toLowerCase().charAt(0);
                System.out.println((op != 'y' && op != 'n') ? "Incorrect option. Please try again ;-)" : "");
            } while ((op != 'y' && op != 'n'));
        } while (op == 'y');
    }

    /**
     * The method changes the price of a product. First, it asks for the name of
     * the product that you want to modify. It prints a message if the name of
     * the product entered does not match any existing product in the product
     * list.
     */
    public void changePrice() {
        boolean flag = true;
        System.out.println("Enter the product´s name:");
        String name = sc.next().toLowerCase();
        System.out.println("Enter the new price:");
        Double newPrice = sc.nextDouble();
        for (Map.Entry<String, Double> product : products.entrySet()) {
            if (product.getKey().equalsIgnoreCase(name)) {
                products.put(name, newPrice);
                flag = false;
            }
        }
        System.out.println(flag ? "The product " + name + " doesn´t exist in the list" : "");
    }

    /**
     * The method deletes a product from the HashMap. First, it asks for the
     * name of the product that you want to delete. It prints a message if the
     * name of the product entered does not match any existing product in the
     * product list.
     */
    public void deleteProduct() {
        boolean flag = true;
        System.out.println("Enter the product´s name:");
        String name = sc.next().toLowerCase();
        for (Map.Entry<String, Double> product : products.entrySet()) {
            if (product.getKey().equalsIgnoreCase(name)) {
                flag = false;
            }
        }
        if (!flag) {
            products.remove(name);
        }
        System.out.println(flag ? "The product " + name + " doesn´t exist in the list" : "");
    }

    /**
     * This method prints a list of products that have the same price. First, it
     * asks the user to enter the price they want to search for, and if the
     * price does not match any in the list, it prints a message.
     */
    public void samePrice() {
        boolean flag = true;
        System.out.println("Enter the product´s price:");
        Double price = sc.nextDouble();
        for (Map.Entry<String, Double> product : products.entrySet()) {
            if (Objects.equals(price, product.getValue())) {
                System.out.println(product);
                flag = false;
            }
        }
        System.out.println(flag ? "Prodcuts whit the price $: " + price + " don´t exist in the list." : "");
    }

    /**
     * It prints the HashMap attribute of the ProductService class.
     */
    public void displayMap() {
        System.out.println("---------------------------------------------");
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.println("Product: " + entry.getKey() + " , " + "price: $" + entry.getValue());
        }
        System.out.println("---------------------------------------------");
    }

    /**
     * This method calls all the previously created methods in the class,
     * displays a menu to interact with the user, and ends when the option to
     * exit is chosen and the character 'y' is entered.
     */
    public void menu() {
        int op;
        char exit = 'n';
        do {
            System.out.println("--------------MENU----------------");
            System.out.println("Choose one option:\n"
                    + "1)Add one or more new products\n"
                    + "2)Change a product´s price\n"
                    + "3)Display the products whit the same price\n"
                    + "4)Display all the products\n"
                    + "5)Delete a product\n"
                    + "6)Exit");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    fillMapProducts();
                    break;
                case 2:
                    changePrice();
                    break;
                case 3:
                    samePrice();
                    break;
                case 4:
                    displayMap();
                    break;
                case 5:
                    deleteProduct();
                    break;
                case 6:
                    do {
                        System.out.println("Do you want to exit?(Y/N)");
                        exit = sc.next().toLowerCase().charAt(0);
                        if (exit != 'y' && exit != 'n') {
                            System.out.println("Incorrect option. Try again :-)");
                        }
                    } while (exit != 'y' && exit != 'n');
                    break;
                default:
                    System.out.println("Incorrect option. Please try again ;-)");
            }
        } while (exit == 'n');
    }
}
