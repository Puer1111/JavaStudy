# Jar 배포

- main() 를 jar 방식으로 빌드 해야한다
- jar 안에서 META-INF/MANIFEST.MF 파일에 실행할 main() 지정 해야한다.
- gradle 을 통해 지정한다
- build.gradle 에 있는 task buildJar 에서 main 메서드 설정.
- ./gradlew clean buildJar 명령어 통해 Jar 생성
    - 단점: Jar 그대로 실행 시 소스코드 제외 모듣 라이브러리가 없기에 에러 발생
    - Jar 는 Jar 파일을 포함할 수 없다 (War 는 Jar 를 포함한다.)
- ./gradlew clean buildJar 대안 -> gradlew clean buildFatJar

# Fat Jar 
- FatJar 는 jar 안에 있는 class 를 뽑아서 jar 에 포함하는 것
- jar 파일에 필요한 라이브러리를 저장할 수 있다.
- 내장 톰캣을 라이브러리를 내장할 수 있다.
- jar 배포부터 웹서버 설치 + 실행 까지 단순화

## 단점
- 어떤 라이브러리가 포함 됬는지 확인이 어렵다.
- 파일명 중복을 해결 할 수 없다.
- 