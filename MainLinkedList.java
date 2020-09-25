import java.util.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList<Product> linkedList = new LinkedList<>();

        Product product1 = new Product("keo", 1, 5000);
        Product product2 = new Product("thach", 2, 25000);
        Product product3 = new Product("bim bim", 3, 10000);
        linkedList.addLast(product1);
        linkedList.addLast(product2);
        linkedList.addLast(product3);

        LinkedListProduct.sortProduct(linkedList);
//        LinkedListProduct.removeProduct(linkedList,2);
//        LinkedListProduct.editProduct(linkedList, 2);
        System.out.println(linkedList);

    }
}
