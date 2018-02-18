package Models.Client;

public class Client {
    private int id;
    private String name;
    private String surname;
    private int age;
    private char sex;
    private String mail;
    private int phoneNumber;

    public Client(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Client(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId() {return id; }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {return age;}


    public void setId(int id) { this.id = id; }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {this.age = age;}

    @Override
    public String toString() {
        return "Client{" + "ID = " + id + ", Name = '" + name + '\'' +
                ", Surname = '" + surname + '\'' + ", Age = " + age+ '\''+'}';
    }
}
