# 만약 조회되는 Bean 이 2개라면?
- NoUniqueBeanDefinitionException 에러 발생

# 해결
- Autowired 필드 명 매칭 : 타입 매칭 시도,그 다음 필드 이름,파라미터 이름으로 추가 매칭
  - ex ) DiscountPolicy rateDiscountPolicy 로 필드명 입력해서 검색되게하기.
- @Qualifier 사용으로 끼리끼리 매칭
  - @Qualifier("이름") 형태로 설정한다. <br> 생성자 매개변수에 @Qualifier("이름") DiscountPolicy discountPolicy 형태로 입력하면 됨.
- @Primary 사용
  - 여러 빈이 조회될 때 @Primary 가 우선순위로 조회 된다.

# 언제 쓸까?
- 메인 DB의 Connection 을 얻는 Bean 은 @Primary 사용
- 서브 DB의 Connection 을 얻는 Bean 은 @Qualifier 사용
- @Primary 는 기본값 처럼 동작하고 @Qualifier 는 섬세하게 동작한다
- 스프링은 자동보단 수동, 넓은 범위보다는 좁은 범위가 우선순위가 높기에 @Qualifier 가 우선권이 높다. 

# Annotation 직접 만들기
- Qualifier 의 문자열은 컴파일에 걸리지 않기에 오타가 나도 실행 되어버리는 문제 발생
- 애노테이션을 직접 만들어서 생성자 매개변수나 클래스 위에 직접 선언함으로써 구별

# 조회 된 빈이 모두 필요할 때 
## List, Map
- 필드에서 타입을 List 나 Map 으로 선언해서 해당 Bean 을 전부 받는다
- 조회 시 Bean 의 이름을 입력해서 조회 된 Bean 중에서 조회한다.

# 자동과 수동의 운영 기준
- 자동을 선호하는 추세이긴하다
- @Component 보다 @Controller,@Service,@Repository 로 쓴다
- Spring boot 의 등장으로 ComponentScan 을 기본으로 사용한다.

## 수동을 그럼 언제 쓸까?
- 로직을 크게 업무와 기술지원 으로 나눌 수 있다
- 업무 : Controller,Service,Repository 가 업무 로직
- 기술 지원: 기술적 문제나,공통 관심사를 처리할 때 사용, DB 연결,공통 로그처리 등등
- 업무의 경우 숫자도 많고 유사한 패턴이 있기에 자동기능을 사용하는게 좋다
- 기술 지원의 경우 수가 적고 광범위 하게 영향을 미치기에 수동 빈 등록을 사용하여 명확하게 들어내는게 좋다.
  - ex ) AllBeanTest 파일 에서 List 에 담기는 DiscountPolicy 가 정확히 뭐가 들어오는지 모르니 일일히 찾아야한다
  - 이럴 떈 수동 Bean 으로 등록하거나 같은 패키지에 묶어야 한다.
