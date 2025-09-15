package hello.config;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.TransactionManager;

import javax.sql.DataSource;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
public class DbConfigTest {
    @Autowired
    DataSource dataSource;
    @Autowired
    TransactionManager transactionManager;
    @Autowired
    JdbcTemplate jdbcTemplate;


    /**
     * Bean 등록 테스트
     */
    @Test
    void checkBean(){
        log.info("dataSource={}", dataSource);
        log.info("transactionManager={}", transactionManager);
        log.info("jdbcTemplate={}", jdbcTemplate);

        assertThat(dataSource).isNotNull();
        assertThat(transactionManager).isNotNull();
        assertThat(jdbcTemplate).isNotNull();

        // 이 3개의 Bean 들은 등록하지 않아도 스프링 부트가 자동으로 등록해준다.

        
    }
}
