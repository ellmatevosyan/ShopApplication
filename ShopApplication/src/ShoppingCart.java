//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
    private List<Product>products;

    ShoppingCart(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public double getTotalPrice(){
        double total = 0;
        for(Product product : products){
            total += product.getPrice();
        }
        return total;
    }
    public void reset(){
        products.clear();
    }
}
