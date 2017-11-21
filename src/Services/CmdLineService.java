package Services;

import java.util.Scanner;

public class CmdLineService {

    private Scanner command = new Scanner(System.in);
    public void showMenu(){
        System.out.println("1. Создать клиента");
        System.out.println("2. Изменить клиента");
        System.out.println("3. Удалить клиента");
        System.out.println("4. Выход");
    }

    public int readComand() {return command.nextInt();}
}
