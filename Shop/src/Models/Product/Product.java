package Models.Product;

public class Product {

    private int articl;
    private String productName;
    private String brandName;
    private int price;


    public Product(int articl, String productName, String brandName, int price) {
        this.articl = articl;
        this.productName = productName;
        this.brandName = brandName;
        this.price = price;
    }
    public Product( String productName, String brandName, int price) {
        this.productName = productName;
        this.brandName = brandName;
        this.price = price;
    }

    public int getArticl() {return articl;}
    public String getProductName() { return productName;}
    public String getBrandName() {return brandName;}
    public int getPrice() {return price;}

    public void setArticl(int articl) {this.articl = articl;}
    public void setProductName(String productName) {this.productName = productName;}
    public void setBrandName(String brandName) {this.brandName = brandName;}
    public void setPrice(int price) {this.price = price;}

    @Override
    public String toString() {
        return "Product{" +
                "articl = " + articl +
                ", productName = '" + productName + '\'' +
                ", brandName = '" + brandName + '\'' +
                ", price = " + price + '\'' +
                '}';
    }
}
