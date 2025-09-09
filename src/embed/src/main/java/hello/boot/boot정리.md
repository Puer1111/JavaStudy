# boot 원리 정리

1. boot 처럼 main 메서드가 아닌 Application 클래스 파일을 만들고 기존에 했던 스프링 컨테이너 생성, DispatcherServlet 생성 및 연결
   설정 파일을 전부 집어 넣고 히나의 설정 파일로 만든다.

2. 스캔 할 패키지의 최상단에 ComponentScan 하여 Bean 을 찾고 실행 시킬 수 있는 Main 클래스 파일을 생성한다.
3. 해당 componentScan 을 할 Annotation 을 생성하여 Main 코드에 선언한뒤 Application 클래스 파일에 만들었던 실행 메서드를 통해 내장 톰캣을 실행 시킨다
