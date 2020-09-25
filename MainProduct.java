import java.util.ArrayList;
import java.util.Scanner;

public class MainProduct {

    public static void main(String[] args) {
        ArrayList<Product> productslist = new ArrayList<>();
        Product product1 = new Product("keo", 1, 5000);
        Product product2 = new Product("thach", 2, 3000);
        Product product3 = new Product("banh", 3, 9000);
        Productmanager.addProduct(productslist, product1);
        Productmanager.addProduct(productslist, product2);
        Productmanager.addProduct(productslist, product3);

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add product");
            System.out.println("2. Edit product");
            System.out.println("3. Remove product");
            System.out.println("4. Display product");
            System.out.println("5. Search product");
            System.out.println("6. Sort increase product");
            System.out.println("7. Sort reduction product");
            System.out.println("8. Exit ");
            System.out.println("Your choose: ");
            int choose = input.nextInt();
            input.nextLine();

            switch (choose){
                case 1:
                    System.out.println("Enter name product: ");
                    String name = input.nextLine();
                    System.out.println("Enter price product: ");
                    double price = input.nextDouble();
                    int id=0;
                    for (Product product: productslist) {
                        id = product.getId();
                    }
                    id +=1;
                    Product product  = new Product(name, id++,price);
                    Productmanager.addProduct(productslist, product);
                    break;
                case 2:
                    System.out.println("Enter id product you want to edit");
                    id = input.nextInt();
                    Productmanager.editProduct(productslist,id);
                    break;
                case 3:
                    System.out.println("Enter id product you want to remove");
                    id = input.nextInt();
                    input.nextLine();
                    Productmanager.removeProduct(productslist,id);
                    break;
                case 4:
                    Productmanager.displayProduct(productslist);
                    break;
                case 5:
                    System.out.println(" Enter name product you want to search");
                    name = input.nextLine();
                    System.out.println(Productmanager.searchProduct(productslist, name));
                    break;
                case 6:
                    Productmanager.sortIncreasePricereductionProduct(productslist);
                    break;
                case 7:
                    Productmanager.sortReductionPriceProduct(productslist);
                    break;
                case 8:
                    System.exit(-1);
                    break;
            }
        }
    }
}
