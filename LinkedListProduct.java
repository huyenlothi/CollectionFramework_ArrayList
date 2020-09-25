import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListProduct {
    public static void addProduct(LinkedList<Product> productslist, Product product){
      productslist.addLast(product);
    }
    public static void editProduct(LinkedList<Product> productslist, int id){
        for (Product product:productslist) {
            if(product.getId() == id){
                Scanner input = new Scanner(System.in);
                System.out.println("menu:");
                System.out.println("1.edit name: ");
                System.out.println("2.edit price: ");
                System.out.println("3.edit name +price : ");
                int choose = input.nextInt();
                input.nextLine();
                switch (choose){
                    case 1:
                        System.out.println("enter new name:");
                        String name = input.nextLine();
                        for (Product product1: productslist) {
                            if(product1.getId() == id){
                                product1.setName(name);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("enter new price:");
                        double price = input.nextDouble();
                        for (Product product1 : productslist) {
                            if(product1.getId() == id){
                                product1.setPrice(price);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("enter new price:");
                        price = input.nextDouble();
                        input.nextLine();
                        System.out.println("enter new name:");
                        name = input.nextLine();
                        for (Product product1: productslist) {
                            if(product1.getId() == id){
                                product1.setPrice(price);
                                product1.setName(name);
                            }
                        }
                        break;
                    default: System.err.println("see you again!");
                        System.exit(-1);
                }
            }
        }
    }
    public static void removeProduct(LinkedList<Product> productslist,int id){
        for (Product product: productslist) {
            if(product.getId() == id){
                productslist.remove(product);
            }
        }
    }
    public static void displayProduct(LinkedList<Product> productslist){
        for (Product product: productslist){
            System.out.println(product.toString());
        }
    }
    public static void searchProduct(LinkedList<Product> productslist, String name){
        for (Product product: productslist) {
            if(product.getName().equals(name)){
                System.out.println(product.toString());;

            }
        }
    }
    public static void sortProduct(LinkedList<Product> productslist){
        Collections.sort(productslist, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getPrice()>o2.getPrice()){
                    return 1;
                }else if (o1.getPrice()< o2.getPrice()){
                    return -1;
                }else
                    return 0;
            }
        });
    }
}
