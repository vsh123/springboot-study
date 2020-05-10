package roadmap.logback.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roadmap/logback")
public class LogBackApiController {

    @GetMapping
    public String logbackTest() {
        return "안녕하세요";
    }
}
