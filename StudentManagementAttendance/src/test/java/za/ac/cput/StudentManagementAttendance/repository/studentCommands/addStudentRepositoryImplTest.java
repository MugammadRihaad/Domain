package za.ac.cput.StudentManagementAttendance.repository.studentCommands;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.repository.impl.StudentRepositoryImpl;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentRepository;

import java.util.HashSet;
import java.util.Set;

public class addStudentRepositoryImplTest {

    private StudentRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = StudentRepositoryImpl.getRepository();
    }

    @Test
    public void create() {
        //create a student, add it to the repository
        this.repository.create(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void getAll() {
        Set<Student> students = this.repository.getAll();
        Assert.assertEquals(1, students.size());
    }
}