package sumdu.edu.ua.mainuniversity;

import java.util.ArrayList;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class StudRegister {
    private String name;
    private String universityName;
    ArrayList<Student> studList=new ArrayList<Student>();
    private Set<Student> students;

    public StudRegister(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public ArrayList<Student> getStudList() {
        return studList;
    }

    public void setStudList(ArrayList<Student> studList) {
        this.studList = studList;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

      
}
