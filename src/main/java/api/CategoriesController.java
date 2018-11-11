package api;

import api.model.Achievement;
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

    /*

                        new Achievement(
                                2,
                                "",
                                "",
                                "",
                                "",
                                10,
                                false
                        ),
                        new Achievement(
                                3,
                                "code-complete",
                                "Code Complete",
                                "Read Code Complete cover to cover.",
                                "code-complete.png",
                                10,
                                true
                        )
                }),
                new Category(2, "travel", "Travel", new Achievement[]{})
        };
     */
}