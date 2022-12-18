package sumdu.edu.ua.mainuniversity;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private int id;
    private String name;
    private Set<Student> students;

    public Department(int id, Set<Student> students) {
        this.id = id;
        this.students = students;
    }     
     
    public String toSting(){
        return this.id+" "+this.students;
    }
    
    public int getId() {
        return id;
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

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void addToDepartment(Student student) {
        this.students.add(student);
    }
    
    public Student getFromDepartment(int id) {
        for(Student st:this.students){
          if(id==st.getId()){return st;}
        } 
          return null;
    }  
  
      
}
