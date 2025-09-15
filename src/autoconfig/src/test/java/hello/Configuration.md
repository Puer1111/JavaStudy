# AutoConfiguration(자동 구성)

- DB 연결에 사용하는 JDBCTemplate,TransactionManager,DataSource
- 이 3개의 요소는 직접 Bean 등록을 하지 않더라도 스프링 부트가 자동 등록을 도와준다.

## How?
- AutoConfiguration 을 통해 내부 파일에서 3개의 파일들을 전부 등록 시킨다.

# 정리
- @Conditional : 특정 조건에 맞을 때 동작하도록 한다
- @AutoConfiguration : 자동 구성이 어떻게 동작하는지 내부 원리 이해