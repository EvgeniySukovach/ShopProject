package Services.impl;

import Models.Product.Product;
import Services.ProductService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    private BufferedReader reader;
    private List<Product> products;

    public ProductServiceImpl() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.products = new ArrayList<>();
    }

    @Override
    public void addProduct() throws IOException {
        System.out.println("Введите артикл продукта: ");
        int articl = readNumber();

        System.out.println("Введите название продукта: ");
        String productName = reader.readLine();

        System.out.println("Введите брэнд продукта: ");
        String brandName = reader.readLine();

        System.out.println("Введите цену продукта: ");
        int price = readNumber();

        products.add( new Product(articl, productName, brandName, price ));
        System.out.println("Вы успешно добавили новый продукт! \n");


    }

    @Override
    public void editProduct() throws IOException {
        if(products.isEmpty()) {
            System.out.println("Нет данных для редактирования :( \n");
            return;}
        System.out.println("Введите артикл продукта: ");
        int articl = readNumber();
        for(Product product: products){
                if(product.getArticl()== articl) {
                System.out.println("Введите новое значение Название Продукта:");
                String newProductName = reader.readLine();
                product.setProductName(newProductName);

                System.out.println("Введите новое значение Название Брэнда:");
                String newBrandName = reader.readLine();
                product.setBrandName(newBrandName);

                System.out.println("Введите новую Цену");
                int newPrice = readNumber();
                product.setPrice(newPrice);
                System.out.println("Вы успешно обновили продукт. \n");

            }else
                System.out.println("Вы ввели несуществующий артикл продукта. \n");
            break;
        }
    }

    @Override
    public void removeProduct() throws IOException {
        System.out.println("Введите артикл продукта: ");
        int articl = readNumber();
        while (products.iterator().hasNext()) {
        Product product = products.iterator().next();
        if (product.getArticl() == articl) {
            products.remove(product);
            System.out.println("Продукт удален.\n");
        }else System.out.println("Вы ввели несуществующий артикл продукта. \n");
        return;
    }

    }
    @Override
    public List<Product> getAllProducts() {
        if(products.isEmpty())
            System.out.println("Нет данных для отображения :( \n");
        return products;
    }

    private int readNumber() throws IOException {
        int temp;
        while (true) {
            try {
                temp = Integer.valueOf(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Не правильный ввод. Введите целое число. \n");
            }
        }
        return temp;
    }

}

