package guru.springframework.RecipeProject.controllers;

import guru.springframework.RecipeProject.domain.Category;
import guru.springframework.RecipeProject.domain.unitOfMeasure;
import guru.springframework.RecipeProject.repositories.CategoryRepository;
import guru.springframework.RecipeProject.repositories.unitMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private unitMeasureRepository unitMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, unitMeasureRepository unitMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitMeasureRepository = unitMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndex(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<unitOfMeasure> unitOfMeasureOptional = unitMeasureRepository.findByDescription("Teaspoon");

        System.out.println("cat ID is: " +categoryOptional.get().getId());
        System.out.println("Unit of Measure ID is: " +unitOfMeasureOptional.get().getId());

        return "index";
    }
}
