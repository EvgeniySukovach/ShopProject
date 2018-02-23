package Services;

import Models.Client.Client;
import java.io.*;
import java.util.List;

public class FileService {

    private File file;
    private BufferedReader reader;
    private PrintWriter writer;

    public FileService() throws Exception {
        this.file = new File("Clients.txt");
        if (!file.exists())
            file.createNewFile();
        this.reader = new BufferedReader(new FileReader(file));
        this.writer = new PrintWriter(new BufferedWriter(new FileWriter(file)));
    }

    public void writeToFile(List<Client> clients) {
        for (Client client : clients) {
            writer.println(client);
            writer.flush();
        }
    }

    public void readFromFile(List<Client> clients) {
        for (Client client : clients) {
            //reader.readLine(client);

        }
    }
}