package Services.impl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import Models.Client.Client;
import DAO.ClientDao;
import Services.ClientService;

public class ClientServiceDb implements ClientService {

    private ClientDao dao;
    private BufferedReader reader;

    public ClientServiceDb(){
        this.dao = new ClientDao();
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void addClient() throws IOException {
        System.out.println("Введите ID:");
        int id = readNumber();
        System.out.println("Введите имя:");
        String name = reader.readLine();
        System.out.println("Введите фамилию:");
        String surname = reader.readLine();
        System.out.println("Введите возраст:");
        int age = readNumber();

        dao.addClient(new Client(id, name, surname, age));

    }

    @Override
    public void removeClient() throws IOException {
        System.out.println("Введите ID:");
        int id = readNumber();
        dao.removeClient(id);

    }

    @Override
    public void editClient() throws IOException {
        System.out.println("Введите ID:");
        int id = readNumber();
        System.out.println("Введите имя:");
        String name = reader.readLine();
        System.out.println("Введите фамилию:");
        String surname = reader.readLine();
        System.out.println("Введите возраст:");
        int age = readNumber();
        dao.updateClient(new Client(id, name, surname, age));
    }

    @Override
    public List<Client> getAllClients() {
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
