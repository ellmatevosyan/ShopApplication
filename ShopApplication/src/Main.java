// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("T-shirt", 12);
        Product product2 = new Product("Skirt",30);
        Product product3 = new Product("Sneakers",150);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        System.out.println("The total price is "+ cart.getTotalPrice());
        Customer customer = new Customer();
        customer.addProductToCart(product3);
        System.out.println("The total price is "+ cart.getTotalPrice());
        Shop shop = new Shop();
        shop.addProduct(product1);
        System.out.println(shop.getName(product1));
    }
}