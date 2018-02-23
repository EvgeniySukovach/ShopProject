package Services.impl;


import Models.Client.Client;
import Services.ClientService;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ClientServiceImpl implements ClientService {

    private BufferedReader reader;
    private ArrayList<Client> clients = new ArrayList<>();


    public ClientServiceImpl(){
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.clients = new ArrayList<>();
    }
    @Override
    public void addClient() throws IOException {
        System.out.println("Введите ID клиента: ");
        int id = readNumber();
        System.out.println("Введите имя клиента: ");
        String name = reader.readLine();
        System.out.println("Введите фамилию клиента: ");
        String surname = reader.readLine();
        System.out.println("Введите возраст клиента: ");
        int age = readNumber();
        clients.add(new Client(id, name, surname, age));
        System.out.println("Вы успешно добавили нового клиента! \n ");

    }

    @Override
    public void removeClient() throws IOException {
        System.out.println("Введите ID клиента: ");
        int id = readNumber();

        while (clients.iterator().hasNext()){
            Client client = clients.iterator().next() ;
            if (client.getClientId() == id) {
                clients.remove(client);
                System.out.println("Клиент удален. \n");
            }else System.out.println("Вы ввели несуществующий ID клиента. \n");
            return;
        }
    }

    @Override
    public void editClient() throws IOException {
        if(clients.isEmpty()) {
            System.out.println("Нет данных для редактирования :( \n");
            return;}
        System.out.println("Введите ID клиента: ");
        int number = readNumber();
        for(Client client: clients){
            if( client.getClientId() == number ) {
                System.out.println("Введите новое значение Имя Клиента");
                String newName = reader.readLine();
                client.setName(newName);

                System.out.println("Введите новое значение Фамилия Клиента");
                String newSurname = reader.readLine();
                client.setSurname(newSurname);

                System.out.println("Введите новое значени Возраст Клиента");
                int newAge = readNumber();
                client.setAge(newAge);
                System.out.println("Вы успешно обновили клиента. \n");
            }else
                System.out.println("Вы ввели несуществующий ID клиента. \n");
            break;
        }
    }

    @Override
    public  List<Client> getAllClients() {
        if(clients.isEmpty()) System.out.println("Нет данных для отображения :( \n");
               return clients ;
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

