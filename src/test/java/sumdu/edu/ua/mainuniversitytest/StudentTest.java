package sumdu.edu.ua.mainuniversitytest;

import static junit.framework.Assert.assertNull;
import org.junit.Test;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import sumdu.edu.ua.mainuniversity.Student;
//звів бібліотеки до використання анотацій jUnit 4 (стабільна і простіша версія)
//Assertions залишив від jupiter (jUnit 5) як більш гнучкий інстркмент перевірок
public class StudentTest {
Student ab=null;
//переглянув документацію тестів і методи налаштування можна маркувати виключно як передвиконання, без тесту якщо треба
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
        Student a=new Student("Stas","Petrenko");
        System.out.print("2 Stas Petrenko ?="+a.toSting());
        assertNotEquals("2 Stas Petrenko",a.toSting());
//id студента 1, то результат буде "1 Стас..." або чекати з assertEquals "1 Stas.." або навпаки чекати щось інше
    }
    
    
    
}
