# 라이브러리 관리 법
- build.gradle - dependency 수정
- id.spring.dependency-management 사용 해야 한다.
  - 사용 시 라이브러리 버전 작성하지 않아도 된다.
  - External Libraries 에 보이진 않는다.
  - build.gradle 안에 bom 이라는 곳에 버전이 다 명시가 되어 있다.
  - 스프링 부트의 버전을 기준으로 다른 라이브러리들의 버전이 바뀐다.
- ※ 스프링 부트가 관리해주지 않는 라이브러리도 있다. -> 이땐 버전 직접 입력해야 한다.

# 스프링 부트 스타터
