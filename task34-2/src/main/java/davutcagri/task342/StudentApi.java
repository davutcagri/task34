package davutcagri.task342;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "student", url = "http://localhost:8081")
public interface StudentApi {

    @GetMapping("/khazar-university")
    List<String> getStudentOfKhazarUniversity();

    @GetMapping("/istanbul-teknik-universitesi")
    List<String> getStudentOfIstanbulTeknikUniversitesi();

}
