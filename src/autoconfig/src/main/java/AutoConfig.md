# AutoConfig 을 하기 위한 과정

- Configuration 을 통한 Bean 설정 
- 다른 패키지에 있는 클래스도 등록해서 사용이 가능
- BUT, 항상 메모리를 사용하지 않고 특정 조건때만 활성화가 필요
- 주의: AutoConfiguration 파일에 ComponentScan 을 쓰면 안된다.

# @Conditional 
- 특정 상황에만 특정 빈들을 등록해서 사용하게 도와준다. 
- 스프링에서 Conditional 을 가지고 여러가지 기능을 제공하는 인터페이스가 있다.
- 스프링 프레임워크의 기능이다. 

# @ConditionalOnProperty
- Configuration 을 직접 수정해주던 @Conditional 과 다르게 한줄에 작성 가능
- 클래스 내부에 보면 결국 @Conditional 이 있다.

## @ConditionalOnXxx
- ConditionalOnClass , ConditionalONMissingClass
  - 클래스가 있는 경우 동작. 그 반대
- ConditionalOnBean , ConditionalOnMissingBean
  - 빈이 있는 경우 동작 , 그 반대
- ConditionalOnProperty
  - 환경 정보가 있는 경우 동작
- ConditionalOnResource
  - 리소스가 있는 경우 동작
- ConditionalOnWebApplication ,ConditionalOnNotWebApplication 
  - 웹 애플리케이션인 경우 동작 , 그 반대
- ConditionalOnExpression
  - SpEL 표현식에 만족하는 경우 동작
- 이 기능들은 스프링 부트가 제공한다.

# AutoConfig 순서
- AutoConfigApplication -> @SpringApplication -> importSelector 

# ImportSelector
- 방법:
  - 1. @import('클래스')  --> 정적
  - 2. @import('ImportSelector') --> 동적
- test/selector/ImportSelectorTest.class 확인

# 자동 구성, 언제 써야 할까?
- 라이브러리를 만들어서 제공 할 때 사용


### AutoConfig 프로젝트 :  project-v1 , project-v2, memory-v1 , memory-v2 프로젝트 