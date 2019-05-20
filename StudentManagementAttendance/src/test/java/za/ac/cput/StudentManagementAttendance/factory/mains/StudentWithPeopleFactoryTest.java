package za.ac.cput.StudentManagementAttendance.factory.mains;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.mains.Student;
import za.ac.cput.StudentManagementAttendance.factory.mainsFactory.StudentFactory;

public class StudentWithPeopleFactoryTest {
    @Test
public void testGetStudent() throws Exception {
    String name = "Deklerk";
    String surname = "Basson";
    String datesNotAttended = "#2019-04-15#";
        String studentNumber = "216183006";
    int numNotAttended = 1;

    Student c = StudentFactory.getStudent(name, surname, datesNotAttended, studentNumber, numNotAttended);
    System.out.println(c);
    Assert.assertNotNull(c.getsName());
}
}