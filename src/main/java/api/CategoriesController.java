package api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriesController {

    @RequestMapping("/categories")
    public Category[] categories() {
        return new Category[]{
                new Category(1, "literature", "Literature", new Achievement[]{
                        new Achievement(
                                1,
                                "the-7-habits-of-highly-effective-people",
                                "The 7 Habits of Highly Effective People",
                                "Read The 7 Habits of Highly Effective People cover to cover.",
                                "the-7-habits-of-highly-effective-people.jpg",
                                10,
                                true
                        )
                })
        };
    }
}