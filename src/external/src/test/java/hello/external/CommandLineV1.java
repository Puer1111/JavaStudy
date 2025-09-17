package hello.external;


import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * 커맨드 라인 추가
 * 실행 서버 -> edit Configurations -> program arguments 에 값 추가
 */
public class CommandLineV1 {
    public static void main(String[] args) {
        for (String arg : args) {
            log.info("arg {}", arg);
        }
    }
}
