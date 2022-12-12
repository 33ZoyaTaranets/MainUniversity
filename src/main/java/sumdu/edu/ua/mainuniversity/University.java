package sumdu.edu.ua.mainuniversity;

import java.util.HashSet;
import java.util.Set;

public class University {
   
    private String name;
    private String address;
    private Set<Department> departments=null;

    public University(String name, String address) {
        this.name = name;
        this.address = address;
        this.departments=new HashSet<Department>();
    }    
    
    public String toSting(){
        return this.name+" "+this.address;
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
     
    
}
