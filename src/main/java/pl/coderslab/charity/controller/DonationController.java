package pl.coderslab.charity.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.entity.Category;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.DonationService;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/donation")
public class DonationController {

    private final CategoryService categoryService;
    private final DonationService donationService;

    @GetMapping("")
    public String showDonationForm(Model model){
        Donation donation = new Donation();
        model.addAttribute("donation", donation);
        return "form/form";
    }

    @ModelAttribute("allCategories")
    public List<Category> getAllCategory(){
        return categoryService.findAll();
    }

}
