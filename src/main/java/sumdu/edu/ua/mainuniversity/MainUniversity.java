package sumdu.edu.ua.mainuniversity;

public class MainUniversity {

    public static void main(String[] args) {
        University  univ=new University("Sumy State University","2, Rimsky-Korsakov Str., 40007 Sumy, Ukraine");
        System.out.println(univ.toSting());
        
        
        Department dep1=new Department("ElIt Department");
        System.out.println(dep1.toSting());
        
        
        Student student11=new Student("Ivan", "Ivanenko");
        dep1.addToDepartment(student11);
        
        Student student12=new Student("Taras","Nesterenko");
        dep1.addToDepartment(student12);
        
        Student student13=new Student("Serhiy","Petrenko");  
        dep1.addToDepartment(student13);
        
        for(Student st:dep1.getStudents()){
            System.out.println(st.toSting());
        }
        
        
        Department dep2=new Department("Ekonom Department");
        System.out.println(dep2.toSting());
        
        
        Student student21=new Student("Ignat", "Vlasenko");
        dep2.addToDepartment(student21);
        
        Student student22=new Student("Olena","Smila");
        dep2.addToDepartment(student22);
        
        Student student23=new Student("Larysa","Malyuk");  
        dep2.addToDepartment(student23);
        
        for(Student st:dep2.getStudents()){
            System.out.println(st.toSting());
        }
        
    }
}
