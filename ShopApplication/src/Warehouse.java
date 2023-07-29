import java.util.HashMap;
import java.util.Map;
public class Warehouse {
    private Map<Product,Integer> productCount;

    Warehouse(){
        productCount = new HashMap<>();
    }

    public void addProduct(Product product, int quantity){
        int currentQuantity = productCount.getOrDefault(product,0);
        productCount.put(product, currentQuantity+quantity);
    }
    public void removeProduct(Product product, int quantity){
        int currentQuantity = productCount.getOrDefault(product,0);
        if(currentQuantity - quantity <= 0){
            productCount.remove(product);
        }else{
            productCount.put(product, currentQuantity - quantity);
        }
    }

    public int getProductQuantity(Product product){
        return productCount.getOrDefault(product,0);
    }

}
