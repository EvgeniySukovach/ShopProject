package Services;

import Models.Product.Product;

import java.io.IOException;
import java.util.List;

public interface ProductService {

    void addProduct() throws IOException;
    void editProduct() throws IOException;
    void removeProduct() throws IOException;

    List<Product> getAllProducts();
}
