package Models.Client;

public class Client {
    private int clientId;
    private String name;
    private String surname;
    private int age;


    public Client(int clientId, String name, String surname, int age) {
        this.clientId = clientId;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Client(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getClientId() {return clientId; }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {return age;}


    public void setClientId(int clientId) { this.clientId = clientId; }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {this.age = age;}

    @Override
    public String toString() {
        return "Client{" + "ID = " + clientId + ", Name = '" + name + '\'' +
                ", Surname = '" + surname + '\'' + ", Age = " + age+ '\''+'}';
    }
}
