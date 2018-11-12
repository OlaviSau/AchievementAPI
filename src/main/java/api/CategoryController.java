package api;

import api.model.Category;
import api.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CategoryController {

    @Autowired
    CategoryRepository repository;



    @RequestMapping(value = "/category/{key}", method = RequestMethod.PUT)
    public void save(@PathVariable(name = "key") String key, @RequestBody Category properties) {
        Category category = repository.findByKey(key).orElse(new Category());
        category.setName(properties.getName());
        category.setKey(properties.getKey());

        repository.save(category);
    }


    @RequestMapping("/category")
    public Iterable<Category> get() {
        return repository.findAll();
    }

    @RequestMapping(value = "/category/{key}", method = RequestMethod.GET)
    public Optional<Category> get(@PathVariable(name = "key") String key) {
        return repository.findByKey(key);
    }
}