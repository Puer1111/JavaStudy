# 의존 관계 주입 방법
- 생성자 주입
- Setter 주입
- 필드 주입
- 일반 메서드 주입

### 생성자 주입
- ServiceImpl 클래스에 생성자 형태로 주입했던 방식
- 생성자 주입 시 딱 1번 호출되는 것 보장
- "불변","필수" 의존 관계에 사용한다.
- 제일 많이 쓰이는 DI
- final 을 통해 생성자에 값이 설정 되지 않았는지 확인할 수 있다.


### Setter 주입
- "선택","변경" 의존 관계에 사용한다.
- 자바 Bean property 규약의 수정자 메서드 방식이다.

#### Bean property 규약
-> 필드의 값을 직접 바꾸지 않고 메서드를 통해 값을 읽거나 수정하는 규칙 <br>
-> setXXX() , getXXX() 

### 필드 주입
- 이름 그대로 필드에 주입 하는 방식
- ex ) @Autowired private MemberRepository; 
- 외부에서 변경이 불가하기에 테스트하기 힘들다
- 가능하면 사용 X

### 일반 메서드 주입
- 일반 메서드를 통해 주입받을 수 있다.
- 생성자랑 형태가 비슷하게 생겼다. ex) @Autowired public void init(MemberRepository){this.memberRepository = memberRepository}
- 일반적으로 쓰진 않는다.

# 옵션 처리
### Autowired 는 내부의 required = true 가 기본으로 되어있어서 오류가 발생함.

- @Autowired(required = false) : 필수가 아니게 바꾼다.
- org.springframework.lang.@Nullable : 자동 주입 대상이 없으면 null 이 입력된다
- Optional <> : 자동 주입 대상이 없으면 Optional.empty 가 입력된다.