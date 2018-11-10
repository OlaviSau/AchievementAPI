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
                        ),
                        new Achievement(
                                2,
                                "introduction-to-algorithms",
                                "Introduction to Algorithms",
                                "Read Introduction to Algorithms cover to cover.",
                                "introduction-to-algorithms.png",
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
    }
}