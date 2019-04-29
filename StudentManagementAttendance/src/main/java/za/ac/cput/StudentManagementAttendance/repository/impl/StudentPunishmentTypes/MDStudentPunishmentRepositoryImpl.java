package za.ac.cput.StudentManagementAttendance.repository.impl.StudentPunishmentTypes;

import za.ac.cput.StudentManagementAttendance.domain.Student;
import za.ac.cput.StudentManagementAttendance.repository.repointerfaces.StudentRepository;

import java.util.HashSet;
import java.util.Set;

public class MDStudentPunishmentRepositoryImpl implements StudentRepository {

    private static MDStudentPunishmentRepositoryImpl repository = null;
    private Set<Student> students;

    private MDStudentPunishmentRepositoryImpl() {
        this.students = new HashSet<>();
    }

    public static StudentRepository getRepository(){
        if(repository == null) repository = new MDStudentPunishmentRepositoryImpl();
        return repository;
    }

    public Student create(Student student){
        this.students.add(student);
        return student;
    }

    public Student read(String studentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Student update(Student student) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentId) {
        //find the student and delete it if it exists

    }

    public Set<Student> getAll(){
        return this.students;
    }
}
