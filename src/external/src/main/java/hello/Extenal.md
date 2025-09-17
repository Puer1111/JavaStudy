# 외부 설정

- 하나의 애플리케이션을 다른 환경에서 사용해야 할 때 맞는 설정값 부여 하는것
- 환경에 따라 변하는 설정값을 "실행 시점"에 주입
    - 코드 -> 빌드 -> 배포 -> 각 서버에서 설정값 주입 -> DB

## 외부 설정 방법

- OS 환경 변수 : Window:set , Mac : printenv
- 자바 시스템 속성(VM options) : JVM 안에서 사용 , java-Durl=dev -jar app.jar (VM 속성 -D 에다가 key=value 주면 된다 , 지금은 url=dev)
- 자바 커맨드 라인 인수(Program Arguments) : main(args) 메서드에서 사용 -> java -jar app.jar dataA,dataB (dataA랑 dataB 가 args 로 전달됨)
    - 단점 : 애플리케이션은 보통 key=value 형식이 좋다. 이 단점을 스프링에서 커버해준다. -> 커맨드 라인 옵션 인수
- 커맨드 라인 옵션 인수 : "-" (dash) 2개로 시작하면 key=value 로 인식한다 형식 ex ) --username=userA
    - ApplicationArguments 를 통해서 등록한다.
- 외부 파일 : 애플리케이션에서 특정 위치 파일 읽음 ex)data/hello.txt , 각 서버마다 해당 파일에 다른 정ㅂ조 저장

### 스프링 외부 설정 통합

- OS,자바시스템,커맨드라인 전부 각각 읽는 방법이 다르다는 단점이 존재.
- 이러한 단점을 'Environment','PropertySource' 라는 추상화로 해결 가능.
- 클라이언트 (설정값 조회:key)--> Environment --> PropertySource (설정 방법 선택)
    - EnvironmentCheck.class 확인

### Environment

- org.springframework.core.env.Environment
- 모든 외부 설정값을 key=value 형태로 전환

## 방법 통합

- 위에 방법 내용들은 결국 개수가 늘어나면 불편해진다.
- .properties 라는 파일은 key=value 형식으로 알아서 변환 ex ) application.properties
- 이런 파일을 설정 데이터(config data) 라고 한다.
- ※ resources 하위에 있는 application.properties 와는 다른 application.properties 이다
    - 단점 : 서버가 10대면 이 파일을 10번 수정해야 한다.

## 내부 파일 분리

- 각 환경에 필요한 application.properties 파일을 전부 포함해서 관리한다.
    - ex) application-dev.properties , application-prod.properties
    - 이런 dev,prod 를 프로필 이라고 한다.
- jar 는 모든 properties 를 다 가지고 배포 한다.

### 프로필

- spring.profiles.active 로 사용
    - ex ) --spring.profiles.active=dev , -DSpring,profiles.active=dev
- application-{prod}.properties 형태로 쓴다
- (IntelliJ) 서버의 edit-configurations 에서 사용.

## 내부 파일 합체

- dev,prod 로 분리 하면 한눈에 들어오지 않는 단점 존재
- application.properties 에서 dev 와 prod 두개를 하나로 합체
    - "#" 과 대시보드 3개를 통해 분리 가능. 반드시 앞에 공백이 있으면 안되고, 분리 앞,뒤로 주석 금지
- application.properties 확인
- 만약 edit configurations 에 프로필을 적용하지 않는다면? -> default 라는 프로필이 실행됨.

### 스프링은 문서를 "위"에서 "아래"로 읽는다

- 따라서 default,dev,prod 순서로 작성되었다 가정하면, 기본적으로 default 를 적용하지만, 만약 설정이 dev 라면 default 를 지나치고 dev 를 읽어서 적용한다.
- 만약 프로필을 2개 활성화 시킨다면 ? -> 적용한 프로필의 마지막 부분 내용이 적용된다.
- prod 로 설정해도 prod 밑에 중복된 내용이 있다면 그 값으로 덮어진다 ex) prod 설정-> But, prod 프로필 밑에 default url 추가 시, prod url 출력 X
- ※ 그렇기에 default 내용을 최상단에 적는 것이 좋다.

# 우선 순위(아래로 갈 수록 높다)

- 설정 데이터(application.properties)
- OS 환경 변수
- 자바 시스템 속성
- 커맨드 라인 옵션 인수
- @TestPropertySource(테스트 용)

## 설정 데이터 우선 순위

- Jar 내부 application.properties
- Jar 내부 프로필 application-{profile}.properties
- Jar 외부 application.properties
- Jar 외부 프로필 application-{profile}.properties

## ※ 자바는 항상 "더"유연하고, 범위가 "좁은" 것이 우선순위가 높다