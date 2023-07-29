import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;
    Warehouse warehouse;

    Shop(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public String getName(Product product){
        return product.getName();
    }
}
