package sumdu.edu.ua.mainuniversitytest;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import sumdu.edu.ua.mainuniversity.Student;

public class StudentTest {
Student ab=null;

    @BeforeAll
    @Test
    public void annotInform(){
        ab=new Student();
    }
    
    /*@Test
    public void toStringTest(){
        Student a=new Student("Stas","Petrenko");
        System.out.print("2 Stas Petrenko ?="+a.toSting());
        assertEquals("2 Stas Petrenko",a.toSting());
    }
    
    @Test
    public void getNameTest(){
        assertNull(ab.getName());
    }*/
    
}
