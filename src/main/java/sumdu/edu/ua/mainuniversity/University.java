package sumdu.edu.ua.mainuniversity;

import java.util.HashSet;
import java.util.Set;

public class University {
   
    private String name;
    private String address;
    private Set<Department> departments;
    private StudRegister studRegister;

    public University(String name, String address, Set<Department> departments) {
        this.name = name;
        this.address = address;
        this.departments = departments;
        
        studRegister = new StudRegister("student list");
        studRegister.setUniversityName(name);
        Set<Student> allStudents = new HashSet<>();
        departments.forEach((department) -> {
            allStudents.addAll(department.getStudents());
        });        
        studRegister.setStudents(allStudents);
    }

    public StudRegister getStudRegister() {
        return studRegister;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }
    
         
}
