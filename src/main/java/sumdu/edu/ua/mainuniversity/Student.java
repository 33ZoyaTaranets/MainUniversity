package sumdu.edu.ua.mainuniversity;

public class Student {
private int id;
private String name;
private String surname;

    public Student(int id, String name, String surname) {
        this.id = id;
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
