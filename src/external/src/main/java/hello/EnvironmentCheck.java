package hello;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Slf4j
@Component
/**
 * Environment 를 통해 program arguments 에 넣든 VM Option 에 넣든 다 출력 된다.
 * But, VMOption,Program Arguments 동시에 작성하면 Program Arguments 가 더 우선순위가 높다. (더 유연하고 , 범위가 좁은 것이 우선권이 높다)
 */
public class EnvironmentCheck {
    private final Environment env;

    public EnvironmentCheck(Environment env) {
        this.env = env;
    }

    @PostConstruct
    public void init() {
        String url = env.getProperty("url");
        String userName = env.getProperty("username");
        String passWord = env.getProperty("password");

        log.info("env url = {}", url);
        log.info("env userName = {}", userName);
        log.info("env passWord = {}", passWord);
    }
}
