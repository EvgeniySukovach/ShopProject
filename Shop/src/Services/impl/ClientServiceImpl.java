package Services.impl;

import DAO.ClientDao;
import Models.Client.Client;
import Services.ClientService;
import Services.CmdLineService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ClientServiceImpl implements ClientService {

    private BufferedReader reader;
    private List<Client> clients;


    public ClientServiceImpl(){
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.clients = new ArrayList<>(1000);
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
        for (Client client: clients){
            if(client.getId()==id) clients.remove(client.getId());
        }
    }

    @Override
    public void editClient() throws IOException {
        System.out.println("Введите ID клиента: ");
        int id = readNumber();
        for(Client client: clients){
            if(client.getId()==id) {
                System.out.println("Введите новое значение Имя Клиента");
                String newName = reader.readLine();
                clients.get(client.getId()).setName(newName);

                System.out.println("Введите новое значение Фамилия Клиента");
                String newSurname = reader.readLine();
                clients.get(client.getId()).setSurname(newSurname);

                System.out.println("Введите новое значени Возраст Клиента");
                int newAge = readNumber();
                clients.get(client.getId()).setAge(newAge);

            }
        }

    }




    @Override
    public  List<Client> getAllClients() {
               return clients ;


    }
    private int readNumber() throws IOException {
        int temp;
        while (true) {
            try {
                temp = Integer.valueOf(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Не правильный ввод. Введите целое число");
            }
        }
        return temp;
    }
}

