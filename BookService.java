import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/books")
public class BookService {
    List<String> books = new ArrayList<>();
    @PostMapping("/add")
    public String addBook(@RequestBody String book) {
        books.add(book);
        return "Book added successfully";
    }

    @GetMapping
    public List<String> getBooks() {
        return books;
    }
}
