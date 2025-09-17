package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j

/**
 * 자바 내부에서 제공하는 설정 속성 - line 17까지
 */
public class JavaSystemProperties {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            log.info("key {} = {}", key, System.getProperty(String.valueOf(key)));
        }

        /**
         * 자바 내부에 속성 추가
         * 실행 서버 -> edit Configuration -> VM option 추가 -> -Durl=devdb -Dusername=dev_user -Dpassword=dev_pw 작성
         * Jar 에서도 똑같이 build 하고 터미널에서 java -Durl=devdb -Dusername=dev_user -Dpassword=dev_pw -jar 로 실행
         */
        String url = System.getProperty("url");
        String userName = System.getProperty("username");
        String password = System.getProperty("password");

        log.info("url = {}", url);
        log.info("username = {}", userName);
        log.info("password = {}", password);

    }
}
