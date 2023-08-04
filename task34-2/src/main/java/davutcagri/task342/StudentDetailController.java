package davutcagri.task342;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentDetailController {

    private final StudentApi studentApi;

    public StudentDetailController(StudentApi studentApi) {
        this.studentApi = studentApi;
    }

    @GetMapping("/khazar-university")
    public ResponseEntity getStudentOfKhazarUniversity() {
        StudentDTO studentDTO = StudentDTO.builder()
                .schoolName("KHAZAR UNIVERSITY")
                .budget("2500")
                .students(studentApi.getStudentOfKhazarUniversity())
                .build();

        return ResponseEntity.ok().body(studentDTO);
    }

    @GetMapping("/istanbul-teknik-universitesi")
    public ResponseEntity getStudentOfIstanbulTeknikUniversitesi() {
        StudentDTO studentDTO = StudentDTO.builder()
                .schoolName("ISTANBUL TEKNIK UNIVERSITESI")
                .budget("3500")
                .students(studentApi.getStudentOfIstanbulTeknikUniversitesi())
                .build();
        return ResponseEntity.ok().body(studentDTO);
    }

}
