package za.ac.cput.StudentManagementAttendance.controller.StudentPunishmentTypes;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import za.ac.cput.StudentManagementAttendance.domain.StudentPunishmentTypes.DDStudentPunishment;
import za.ac.cput.StudentManagementAttendance.factory.StudentTypesFactory.DDStudentPunishmentFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class DDStudentPunishmentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/DDStudentPunishment";

    @Test
    public void testGetAllDDStudentPunishments() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

    @Ignore
    public void testGetDDStudentPunishmentById() {
        DDStudentPunishment student = restTemplate.getForObject(baseURL + "/student/1", DDStudentPunishment.class);
        System.out.println(student.getStudentID());
        assertNotNull(student);
    }

    @Ignore
    public void testCreateDDStudentPunishment() {
//        DDStudentPunishment student = DDStudentPunishmentFactory.getADStudent("John"," Doh","06/03/1045", "216183006", 10);

//        ResponseEntity<DDStudentPunishment> postResponse = restTemplate.postForEntity(baseURL + "/create", student, DDStudentPunishment.class);
//        assertNotNull(postResponse);
//        assertNotNull(postResponse.getBody());
    }

    @Ignore
    public void testUpdateDDStudentPunishment() {
        int id = 1;
        DDStudentPunishment student = restTemplate.getForObject(baseURL + "/student/" + id, DDStudentPunishment.class);

        restTemplate.put(baseURL + "/students/" + id, student);
        DDStudentPunishment updatedDDStudentPunishment = restTemplate.getForObject(baseURL + "/DDStudentPunishment/" + id, DDStudentPunishment.class);
        assertNotNull(updatedDDStudentPunishment);
    }

    @Ignore
    public void testDeleteEmployee() {
        int id = 2;
        DDStudentPunishment student = restTemplate.getForObject(baseURL + "/students/" + id, DDStudentPunishment.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/students/" + id);
        try {
            student = restTemplate.getForObject(baseURL + "/students/" + id, DDStudentPunishment.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}
