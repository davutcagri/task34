package davutcagri.task341;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StundentController {

    @GetMapping("/khazar-university")
    public List<String> getStudentOfKhazarUniversity() {
        return Arrays.asList("Davut Çağrı", "Ahmet", "Ali", "Ayşe");
    }

    @GetMapping("/istanbul-teknik-universitesi")
    public List<String> getStudentOfIstanbulTeknikUniversitesi() {
        return Arrays.asList("Cem", "Mehmet", "Fatma", "Azra");
    }

}
