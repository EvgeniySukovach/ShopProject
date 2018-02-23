package Services;

import java.io.IOException;
import java.util.List;
import Models.Client.Client;

   public interface ClientService {

    void addClient() throws IOException;
    void removeClient () throws IOException;
    void editClient() throws IOException;
    List<Client> getAllClients();
}
