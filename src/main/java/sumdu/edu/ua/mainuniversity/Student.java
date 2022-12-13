package sumdu.edu.ua.mainuniversity;

public class Student {
private int id;
private static int nextId=1;
private String name;
private String surname;

    public Student(String name, String surname) {
        this.id = nextId++;
        this.name = name;
        this.surname = surname;
    }

    public String toSting(){
        return this.id+" "+this.name+" "+this.surname;
    }
    
    public int getId() {
        return id;
    }

    public Student() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
