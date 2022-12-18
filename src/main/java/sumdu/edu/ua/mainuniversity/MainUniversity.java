package sumdu.edu.ua.mainuniversity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MainUniversity {
    public static void main(String[] args) {        
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        
        Student student11=new Student(1,"Ivan", "Ivanenko");         
        Student student12=new Student(2,"Taras","Nesterenko");
        Student student13=new Student(3,"Serhiy","Petrenko");  
                
        Student student21=new Student(4,"Ignat", "Vlasenko");
        Student student22=new Student(5,"Olena","Smila");
        Student student23=new Student(6,"Larysa","Malyuk");  
            
            Set<Student> firstDepStud = new HashSet<>();
            firstDepStud.add(student11);
            firstDepStud.add(student12);
            firstDepStud.add(student13);
            
            Set<Student> secondDepStud = new HashSet<>();
            secondDepStud.add(student21);
            secondDepStud.add(student22);
            secondDepStud.add(student23);   
                        
        Department firstDep = new Department(256, firstDepStud);
        Department secondDep = new Department(652, secondDepStud);
            for(Student st:firstDep.getStudents()){
            System.out.println(st.toSting());
        }
            for(Student st:secondDep.getStudents()){
            System.out.println(st.toSting());
        }
                
        Set<Department> depUniv = new HashSet<>();
        depUniv.add(firstDep);
        depUniv.add(secondDep);
            System.out.println(depUniv.size());
        
        University univ1=new University("Sumy State University","2, Rimsky-Korsakov Str., 40007 Sumy, Ukraine", depUniv);
        University univ2=new University("Sumy National Agrarian University","160, Gerasima Kondratieva Str., 40000 Sumy, Ukraine", depUniv);
                
        StudRegister studRegister = (StudRegister) context.getBean("stud_register");
                
        StudRegister newstudRegister = (StudRegister) context.getBean("stud_register");
        newstudRegister.setUniversityName("Sumy National Agrarian University");
                
        ArrayList<University> listOfUniversities = new ArrayList<>();
        listOfUniversities.add(univ1);
        listOfUniversities.add(univ2);
            System.out.println(listOfUniversities.size());      
         
        EduMinistry edum = (EduMinistry) context.getBean("eduministry");
        edum.setListOfUniversities(listOfUniversities);
        
        edum.getListOfUniversities().get(0).getStudRegister().getStudents().forEach((student) -> {
            System.out.println(student.getName());
        });      
    }
}