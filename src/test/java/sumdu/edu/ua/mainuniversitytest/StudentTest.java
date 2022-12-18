package sumdu.edu.ua.mainuniversitytest;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import org.junit.Test;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import sumdu.edu.ua.mainuniversity.Student;

public class StudentTest {
Student ab=null;

    @Before
    public void annotInform(){
        ab=new Student();
    }
    @Test
    public void getNameTest(){
        assertNull(ab.getName());
    }
    @Test
    public void toStringTest(){
        Student a=new Student(2,"Stas","Petrenko");
        System.out.print("2 Stas Petrenko ?="+a.toSting());
        assertEquals("2 Stas Petrenko",a.toSting());
    }
    
    
    
}
