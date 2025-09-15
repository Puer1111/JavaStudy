# 외부 라이브러리 적용해보기

- 라이브러리 프로젝트에서 추출한 Jar(build->libs 에 존재) 복사
- 사용할 프로젝트에 프로젝트 하위에 libs 생성 후 붙혀녛기
- build.gradle 에 implementation files('libs/memory-v1.jar')
- jar 가 열려야 성공
- jar 에 있는 클래스들 Bean 등록