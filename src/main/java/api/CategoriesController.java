package api;

import api.model.Category;
import api.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriesController {

    @Autowired
    CategoryRepository repository;

    @RequestMapping("/categories")
    public Iterable<Category> categories() {
        return repository.findAll();
    }
}