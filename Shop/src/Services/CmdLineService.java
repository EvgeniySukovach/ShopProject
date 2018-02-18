package Services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Models.Client.Client;
import Models.Product.Product;

public class CmdLineService  {

    private final BufferedReader reader;
    private final ClientService clientService;
    private final ProductService productService;


    public CmdLineService(ClientService clientService, ProductService productService){
        this.clientService = clientService;
        this.productService = productService;
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void    mainMenu() throws IOException{

        boolean isWork = true;
        do {
            showMainMenu();
            String s = reader.readLine();
            switch(s){
                case "1": clientMenu();
                    break;
                case "2": productMenu();
                    break;
                case "00":
                    System.out.println(" Exit Ok.");
                    isWork = false;
                    break;
                default :
                    System.out.println(" Неправильный ввод \n");
                    break;
            }
        } while(isWork);
    }
    //---------------------------------------------------
    public void  clientMenu() throws IOException{
        showClientMenu();
        boolean isWork = true;
        do {
            String s = reader.readLine();

            switch (s) {
                case "1":
                    System.out.println("Создаем нового клиента: ");
                    clientService.addClient();
                    showClientMenu();
                    break;
                case "2":
                    System.out.println("Редактируем клиента:");
                    clientService.editClient();
                    showClientMenu();
                    break;
                case "3":
                    System.out.println("Удаляем клиента:");
                    clientService.removeClient();
                    showClientMenu();
                    break;
                case"4":
                    for (Client client: clientService.getAllClients()) {
                        System.out.println(client);
                    }
                case "0":
                    isWork = false;
                    break;
                default:
                    System.out.println("Неправильный ввод! ");
                    break;
            }
        }
        while (isWork);
    }
    //---------------------------------------------------
    public void productMenu() throws IOException{
        showProductMenu();
        boolean isWork = true;

        do {
            String s = reader.readLine();

            switch(s){
                case "1":
                    System.out.println("Создаём новый продукт: ");
                    productService.addProduct();
                    showProductMenu();
                    break;
                case "2":
                    System.out.println("Редактируем продукт:");
                    productService.editProduct();
                    showProductMenu();
                    break;
                case"3":
                    System.out.println("Удаляем продукт:");
                    productService.removeProduct();
                    showProductMenu();
                    break;
                case"4":
                    for (Product product: productService.getAllProducts()) {
                        System.out.println(product);
                    }
                case"0":
                    isWork = false;
                    break;
                default:
                    System.out.println("Неправильный ввод \n");
            }

        } while (isWork);

    }
    //---------------------------------------------------
    public static void    showMainMenu() {
        System.out.println("\n   < Главное Меню >");
        System.out.println("1. Управление клиентами");
        System.out.println("2. Управление продуктами");
        System.out.println("00. Выход");
    }
    public static void  showClientMenu() {
        System.out.println("< Управление клиентами >");
        System.out.println("1. Создать клиента");
        System.out.println("2. Изменить клиента");
        System.out.println("3. Удалить клиента");
        System.out.println("4. Все клиенты");
        System.out.println("0. Возврат в предыдущее меню");
    }
    public static void showProductMenu() {
        System.out.println(" < Управление продуктами >");
        System.out.println("1. Создать продукт");
        System.out.println("2. Изменить продукт");
        System.out.println("3. Удалить продукт");
        System.out.println("4. Все продукты");
        System.out.println("0. Возврат в предыдущее меню");

    }

}
