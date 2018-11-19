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



    @RequestMapping(value = "/category", method = RequestMethod.PUT)
    public long save(@RequestBody Category properties) {
        Category category = repository.findById(properties.getId()).orElse(new Category());
        category.setName(properties.getName());
        category.setKey(properties.getKey());

        return repository.save(category).getId();
    }

    @RequestMapping(value = "/category/{key}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(name = "key") String key) {
        repository.findByKey(key).ifPresent(category -> repository.delete(category));
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