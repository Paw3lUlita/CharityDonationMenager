package pl.coderslab.charity.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.entity.Category;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.DonationService;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/donation")
public class DonationController {

    private final CategoryService categoryService;
    private final DonationService donationService;

    @ModelAttribute("allCategories")
    public List<Category> getAllCategory(){
        return categoryService.findAll();
    }

}
