package sumdu.edu.ua.mainuniversitytest;

import static junit.framework.Assert.assertEquals;
import sumdu.edu.ua.mainuniversity.Department;
import org.junit.Test;
//замінив бібліотеку на org.junit.Test;
public class DepartmentTest {
    
    @Test
    public void setNameTest(){
       Department test=new Department("Univer");
       assertEquals("Univer",test.getName());
       test.setName("Institute");
       assertEquals("Institute",test.getName());
    }
}