package roadmap.logback.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roadmap/logback")
public class LogBackApiController {

    private static final Logger roadmapConsoleLogger = LoggerFactory.getLogger("roadmapConsole");

    @GetMapping
    public String logbackTest() {
        roadmapConsoleLogger.info("콘솔 로깅 입니다.");
        return "안녕하세요";
    }
}
