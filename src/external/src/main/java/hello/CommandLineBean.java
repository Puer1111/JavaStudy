package hello;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
@Slf4j
/**
 * ExternalApplication 에서 run 할때 ApplicationArguments 를 Bean 등록하고 -> 서버에 program Arguments 값 찾아서 같이 등록
 */
public class CommandLineBean {
    private final ApplicationArguments arguments;

    public CommandLineBean(ApplicationArguments arguments) {
        this.arguments = arguments;
    }

    @PostConstruct
    public void init() {
        log.info("Source={}", List.of(arguments.getSourceArgs()));
        log.info("optionNames={}", arguments.getOptionNames());
        Set<String> OptionNames = arguments.getOptionNames();
        for (String OptionName : OptionNames) {
            log.info("OptionName={}={}", OptionName, arguments.getOptionValues(OptionName));
        }
    }
}
