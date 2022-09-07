package pl.coderslab.charity;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.repository.InstitutionRepository;

import java.util.List;


@Controller
@AllArgsConstructor
public class HomeController {

    private final InstitutionRepository institutionRepository;

    @RequestMapping("/")
    public String homeAction(Model model){
        return "homepage/index";
    }

    @ModelAttribute("institutions")
    public List<Institution> getAllInstitutions(){
        return institutionRepository.findAll();
    }
}
