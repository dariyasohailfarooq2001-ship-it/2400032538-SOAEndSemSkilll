import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/members")
public class MemberService {

    List<String> members = new ArrayList<>();

    @PostMapping("/add")
    public String addMember(@RequestBody String member) {
        members.add(member);
        return "Member added successfully";
    }

    @GetMapping
    public List<String> getMembers() {
        return members;
    }
}
