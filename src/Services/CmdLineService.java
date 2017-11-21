package Services;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CmdLineService  {

    public void mainMenu(){
    Scanner scanner = new Scanner(System.in);
    boolean isWork = true;
    do {
        System.out.println("1. Управление клиентами");
        System.out.println("2. Управление продуктами");
        System.out.println("0. Выход");

        int s = 100;
        try {
            s = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Неправильный ввод \n");

        }
        switch (s) {
            case 1:
                System.out.println("Client Menu");
                break;
            case 2:
                System.out.println("Product Menu");
                break;
            case 0:
                isWork = false;
                break;
            default:
                System.out.println("Неправильный ввод \n");
                break;
        }
    }
        while (isWork);
    }
    public void clientMenu() {
        boolean isWork = true;
        do {
            System.out.println("1. Создать клиента");
            System.out.println("2. Изменить клиента");
            System.out.println("3. Удалить клиента");
            System.out.println("0. Выход");
        }
        while (isWork);
    }
    public void prodactMenu() {
        boolean isWork = true;
        do {
            System.out.println("1. Создать продукт");
            System.out.println("2. Изменить продукт");
            System.out.println("3. Удалить продукт");
            System.out.println("0. Выход");
        }
        while (isWork);
    }

}
