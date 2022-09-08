package pl.coderslab.charity.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.repository.InstitutionRepository;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.InstitutionService;

import java.util.List;


@Controller
@AllArgsConstructor
@RequestMapping("/")
public class HomeController {

    private final InstitutionService institutionService;
    private final DonationService donationService;

    @RequestMapping("")
    public String homeAction(Model model){
        return "homepage/index";
    }

    @ModelAttribute("institutions")
    public List<Institution> getAllInstitutions(){
        return institutionService.findAll();
    }

    @ModelAttribute("allBags")
    public int getNumberOfBags(){

        return donationService.getNumberOfBags();
    }

    @ModelAttribute("allDonations")
    public int getNumberOfDonations(){
        return donationService.findAll().size();
    }
}
