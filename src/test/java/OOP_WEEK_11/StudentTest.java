package OOP_WEEK_11;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class StudentTest {



    @Test
    void testIfStudentIsPresent() throws FileNotFoundException {
        StudentSystem studentSystem = new StudentSystem("students.csv");
        assertFalse(studentSystem.students.isEmpty());
    }


    @Test
    void testStudentWithId100() throws StudentNotFoundException {
        StudentSystem studentSystem = new StudentSystem("students.csv");

        Student student = studentSystem.getStudentById(100);
        System.out.println(student);
        assertNotNull(student);
    }

    @Test
    void testStudentIsNull() throws StudentNotFoundException {
        StudentSystem studentSystem = new StudentSystem("students.csv");

        assertNotNull(studentSystem);

    }


    @Test
    void testIfUserID20Exists() throws StudentNotFoundException {
        StudentSystem studentSystem = new StudentSystem("students.csv");

        Optional<Student> student = studentSystem.getStudentByIdOPTIONAL(20);
        System.out.println(student);
        assertNotNull(student);
    }

    @Test
    void seeIfDepartmentMatches(){
        StudentSystem studentSystem = new StudentSystem("students.csv");

        // 8,   Aiden Rivera,   "Stanford University",  Finance,    9.0 //

        String dept = "Finance";
        assertEquals(dept, studentSystem.students.get(8).getDepartment());

    }

    @Test
    void seeIfFirstNameMatchesCamilaWood(){
        StudentSystem studentSystem = new StudentSystem("students.csv");
        String name = "Camila Wood";

    // 0,   Camila Wood,    "Stanford University",  Finance,    9.0 //

    assertEquals(name, studentSystem.students.get(0).getName());
    }
    @Test
    void seeIfCamilaWoodIs9GPA(){
        StudentSystem studentSystem = new StudentSystem("students.csv");
        Double Expected_GPA = 9.0;

        assertEquals(9.0 , studentSystem.students.get(0).getGpa());
    }


    @Test
    void testSize(){
        StudentSystem studentSystem = new StudentSystem("students.csv");
        assertEquals(70, studentSystem.students.size());
    }


    @Test
        void testNamesArray() {
        String[] expectedNames = {"Camila Wood", "Alexander Thompson", "Liam Taylor", "Evelyn Jenkins", "Michael Jackson", "Chloe Moore"};
        StudentSystem system = new StudentSystem("students.csv");
        List<String> names = system.students.stream().map(Student::getName).limit(6).collect(Collectors.toList());

    /*  0,Camila Wood,"Stanford University",Finance,9.0
        1,Alexander Thompson,"Stanford University",Finance,6.7
        2,Liam Taylor,"Harvard University",Accounting Analytics,8.6
        3,Evelyn Jenkins,"Stanford University",Finance,8.0
        4,Michael Jackson,"Harvard University",International Business,8.5
        5,Chloe Moore,"Stanford University",Finance,8.3 */


        assertEquals(names.toArray(), expectedNames);
    }


    @Test
    void testLargestName(){
        StudentSystem system = new StudentSystem("students.csv");
        assertNotEquals("Ava White", system.getLongestStudentName());
    }

    @Test
    void testStudents(){
        StudentSystem system = new StudentSystem("students.csv");
        assertNotEquals(system.getHighestGPA(), system.getLongestStudentName());
    }

    @Test
    void testSameStudent() throws StudentNotFoundException {
        StudentSystem system = new StudentSystem("students.csv");
        assertSame(system.getHighestGPA(), system.getStudentById(12));
    }

    @Test
    void testHighestGPAStudentNotCamilla(){
        StudentSystem system = new StudentSystem("students.csv");
        assertNotSame("Camila Wood", system.getHighestGPA());
    }

    @Test
    void testExceptionForEmptyStudentList(){
        StudentSystem studentSystem = new StudentSystem("empty.csv");
        System.out.println(studentSystem);
    }

    @Test
    void testStudentNull(){

        Student student = null;
        assertNull(student);
    }

    @Test
    void testStudentListExists() throws FileNotFoundException {
        StudentSystem studentSystem = new StudentSystem("students.csv");
        assertNotNull(studentSystem);

    }
}