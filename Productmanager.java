import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Productmanager {

    public static void addProduct(ArrayList<Product> productslist, Product product) {
        productslist.add(product);
    }

    public static void editProduct(ArrayList<Product> productslist, int id) {
        for (Product products : productslist) {
            if (products.getId() == id) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("menu:");
                System.out.println("1.edit name");
                System.out.println("2.edit price");
                System.out.println("3.edit name + price ");
                System.out.println("enter choose:");
                int choose = scanner.nextInt();
                scanner.nextLine();

                switch (choose){
                    case 1:
                        System.out.println("enter new name:");
                        String name = scanner.nextLine();
                        for (Product product: productslist) {
                            if(product.getId() == id){
                                product.setName(name);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("enter new price:");
                        double price = scanner.nextDouble();
                        for (Product product: productslist) {
                            if(product.getId() == id){
                                product.setPrice(price);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("enter new price:");
                        price = scanner.nextDouble();
                        System.out.println("enter new name:");
                        scanner.nextLine();
                        name = scanner.nextLine();
                        for (Product product: productslist) {
                            if(product.getId() == id){
                                product.setPrice(price);
                                product.setName(name);
                            }
                        }
                        break;
                    default: System.err.println("see you again!");
                    System.exit(-1);
                }
            }
        }
    }

    public static void removeProduct(ArrayList<Product> productslist, int id) {
        productslist.removeIf(products -> products.getId() == id);
    }

    public static void displayProduct(ArrayList<Product> productslist) {
        for (Product product: productslist) {
            System.out.println(product.toString());
        }
    }

    public static String searchProduct(ArrayList<Product> productslist, String name) {
    for (Product product: productslist){
       if(product.getName().equals(name)) {
           return "Product your search: "+ product.toString();
       }
    }
        return "Not found name product";
    }

    public static void sortIncreasePricereductionProduct(ArrayList<Product> productslist) {
        Collections.sort(productslist, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getPrice() > o2.getPrice()){
                    return 1;
                }else if(o1.getPrice()< o2.getPrice()){
                    return -1;
                }else
                return 0;
            }
        });
    }
    public static void sortReductionPriceProduct(ArrayList<Product> productslist) {
        Collections.sort(productslist, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getPrice() < o2.getPrice()){
                    return 1;
                }else if(o1.getPrice() > o2.getPrice()){
                    return -1;
                }else
                    return 0;
            }
        });
    }

}
