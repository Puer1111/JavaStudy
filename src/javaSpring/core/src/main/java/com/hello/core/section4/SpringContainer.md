# 스프링 컨테이너 생성

## 규칙
- 컨테이너는 표처럼 Bean 이름과 Bean 객체로 나뉘어져 있다.<br>
- 따라서 생성 할때는 구성 정보를 지정해주어야 한다.
- Section2,3 예시로는 이름 - memberService , 객체 - memberServiceImpl@(참조값 주소) 이런식으로 구성됨.
- Bean 은 메서드 이름을 사용하거나 직접 부여할 수 있다 But, 무조건 다른 이름을 부여해야한다.
- SpringContainer 는 설정 정보 (메서드 안에서 의존하는 파일들 확인) 참고해서 DI 한다.

## 흐름
- AppConfig.class 처럼 각각 @Bean 을 가진 메서드들 생성  
- 해당 메서드에서 다른 구현체를 의존 
- 각각의 Bean 이 모두 생성되고 난 뒤 서로 의존관계를 주입한다. 


## 계층
- 1. BeanFactory <<interface>> : getBean() 제공 , 스프링 컨테이너 최상위
- 2. ApplicationContext <<interface>> : 환경 변수 , 애플리케이션 이벤트 , 리소스 조회 , 메시지 소스를 활용한 국제화 기능(영어 - 영어로 , 한국어 - 한국어로 출력)
- 3. AnnotationConfig , ApplicationContext
