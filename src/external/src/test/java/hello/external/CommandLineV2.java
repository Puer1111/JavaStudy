package hello.external;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;

import java.util.List;
import java.util.Set;

@Slf4j
/**
 * 대시보드를 이용한 스프링 커맨드 인수 옵션 활용
 */
public class CommandLineV2 {
    public static void main(String[] args) {
        // --url=url.db.com --username=dev_user --password=dev_pw mode=on

        for (String arg : args) {
            log.info("arg = {}", arg);
        }

        ApplicationArguments appArgs = new DefaultApplicationArguments(args);
        log.info("SourceArgs = {}", List.of(appArgs.getSourceArgs()));
        log.info("NonOptionsArgs={}", appArgs.getNonOptionArgs());
        log.info("OptionsNames={}", appArgs.getOptionNames());

        Set<String> optionsNames = appArgs.getOptionNames();
        for (String optionName : optionsNames) {
            log.info("optionName {} = {}", optionName, appArgs.getOptionNames());
        }
        List<String> url = appArgs.getOptionValues("url");
        List<String> username = appArgs.getOptionValues("username");
        List<String> password = appArgs.getOptionValues("password");
        List<String> mode = appArgs.getOptionValues("mode");
        log.info("url = {}", url);
        log.info("username = {}", username);
        log.info("password = {}", password);
        log.info("mode = {}", mode);

    }
}
