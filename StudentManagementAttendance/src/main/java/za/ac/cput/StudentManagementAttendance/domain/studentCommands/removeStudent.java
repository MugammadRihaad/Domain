package za.ac.cput.StudentManagementAttendance.domain.studentCommands;

import za.ac.cput.StudentManagementAttendance.domain.Student;

public class removeStudent extends Student {

    private removeStudent(Builder builder) {
        super(builder);
    }

    public static class Builder extends Student.Builder {
        public removeStudent build(){
            return new removeStudent(this);
        }
    }
    @Override
    public String toString() {
        return "ADStudent{" +
                "sName='" + getsName() + '\'' +
                ", sSurname='" + getsSurname() + '\'' +
                ", datesNotAttended='" + getDatesNotAttended() + '\'' +
                ", ssStudentNum=" + getSsStudentNum() +
                ", numNotAttended=" + getNumNotAttended() +
                '}';
    }
}