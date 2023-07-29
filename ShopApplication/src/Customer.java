public class Customer {
    ShoppingCart shoppingCart;
    Customer(){
        shoppingCart = new ShoppingCart();

    }


    public void addProductToCart(Product product){
        shoppingCart.addProduct(product);
    }
    public void removeProductFromCart(Product product){
        shoppingCart.removeProduct(product);
    }
    public double getTotalPriceInCart(){
        return shoppingCart.getTotalPrice();
    }
    public ShoppingCart purchase(){
        shoppingCart.reset();
        return shoppingCart;
    }

}
