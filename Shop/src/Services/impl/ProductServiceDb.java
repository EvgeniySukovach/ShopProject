package Services.impl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import Models.Product.Product;
import DAO.ProductDao;
import Services.ClientService;
import Services.ProductService;
public class ProductServiceDb implements ProductService{

    private ProductDao dao;
    private BufferedReader reader;


    public ProductServiceDb() {
       this.dao = new ProductDao();
       this.reader = new BufferedReader(new InputStreamReader(System.in));
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

        dao.addProduct( new Product(articl, productName, brandName, price ));
        System.out.println("Вы успешно добавили новый продукт! \n");
    }

    @Override
    public void editProduct() throws IOException {
        System.out.println("Введите артикл продукта: ");
        int articl = readNumber();

                System.out.println("Введите новое значение Название Продукта:");
                String newProductName = reader.readLine();

                System.out.println("Введите новое значение Название Брэнда:");
                String newBrandName = reader.readLine();

                System.out.println("Введите новую Цену");
                int newPrice = readNumber();
                dao.updateProduct(new Product(articl, newProductName, newBrandName, newPrice));

    }
    @Override
    public void removeProduct() throws IOException {

    }

    @Override
    public List<Product> getAllProducts() {
        return dao.getAll();
    }
    private int readNumber()throws IOException{
        int id;
        while (true) {
            try {
                id = Integer.valueOf(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Не правильный ввод. Введите целое число");
            }
        }
        return id;
    }
}
