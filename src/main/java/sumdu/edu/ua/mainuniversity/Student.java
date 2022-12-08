package sumdu.edu.ua.mainuniversity;

public class Student {
private int id;
private static int nextId=1;
private String name;
private String surname;

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

}
