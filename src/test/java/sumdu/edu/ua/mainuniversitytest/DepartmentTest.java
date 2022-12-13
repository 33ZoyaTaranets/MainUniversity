package sumdu.edu.ua.mainuniversitytest;

import static junit.framework.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import sumdu.edu.ua.mainuniversity.Department;

public class DepartmentTest {
    
    @Test
    public void setNameTest(){
       Department test=new Department("Univer");
       assertEquals("Univer",test.getName());
       test.setName("Institute");
       assertEquals("Institute",test.getName());
    }
}
