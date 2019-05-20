package za.ac.cput.StudentManagementAttendance.repository.repointerfaces.mains;

import za.ac.cput.StudentManagementAttendance.domain.mains.StudentSponsor;
import za.ac.cput.StudentManagementAttendance.repository.IRepository;

import java.util.Set;

public interface StudentSponsorRepository extends IRepository<StudentSponsor, String> {
    Set<StudentSponsor> getAll();

}