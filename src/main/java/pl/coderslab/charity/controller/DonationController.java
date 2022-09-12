package pl.coderslab.charity.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.charity.entity.Category;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.InstitutionService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/donation")
public class DonationController {

    private final CategoryService categoryService;
    private final DonationService donationService;
    private final InstitutionService institutionService;

    @GetMapping("")
    public String showDonationForm(Model model){
        Donation donation = new Donation();
        model.addAttribute("donation", donation);
        return "form/form";
    }

    @PostMapping("")
    public String saveDonation(Donation donation, @RequestParam(name = "date") String date, @RequestParam(name = "time") String time){

        donation.setPickUpDate(LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        donation.setPickUpTime(LocalTime.parse(time));

        donationService.save(donation);

        return "form/confirmation";

    }

    @ModelAttribute("allCategories")
    public List<Category> getAllCategory(){
        return categoryService.findAll();
    }

    @ModelAttribute("institutions")
    public List<Institution> getAllInstitutions(){
        return institutionService.findAll();
}

    }
