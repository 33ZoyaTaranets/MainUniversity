package sumdu.edu.ua.mainuniversity;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class EduMinistry {
    private String name;
    private ArrayList<University> listOfUniversities;

    public EduMinistry(String name) {
        this.name = name;
    }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<University> getListOfUniversities() {
        return listOfUniversities;
    }

    public void setListOfUniversities(ArrayList<University> listOfUniversities) {
        this.listOfUniversities = listOfUniversities;
    }
}
