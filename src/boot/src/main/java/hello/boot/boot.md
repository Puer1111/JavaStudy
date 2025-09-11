# 스프링 부트 실행 과정

- BootApplication 클래스 안에 있는 단순한 한줄은 무수한 설정 파일들이 존재한다.
- 내부 jar 를 분해해보면 Fat Jar 가 아닌데도 다른 Jar 가 존재하는게 보임.
    - 이걸 스프링 부트는 내부에 jar 를 포함할 수 있게 구조를 만들고 내부 jar 포함해서 실행할 수 있게 했다.
    - 이걸 실행가능 Jar(Executable Jar)라고 한다.
    - 단점: 어떤 라이브러리가 있는지 확인하기 어렵다 , 파일명 중복을 해결 할 수 없다.
- java -jar xxx.jar 실행 시 META-INF/MANIFEST.MF 찾고 해당 내부에 Main-Class 에는 JarLauncher 가 지정됨.
- JarLauncher 가 내부 jar 를 읽어들이는 기능을 수핻하고 그 다음에 Start-Class 에 설정된 main() <- BootApplication 이 실행된다.

※터미널이 아니라 IDE 에서 실행하면 JarLauncher 가 아니라 main()을 바로 실행한다.