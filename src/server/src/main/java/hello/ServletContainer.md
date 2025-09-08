# 초기화

ServletContainerInitializer 라는 인터페이스 게종
onStartup() 을 호출 해준다

# 등록 법
- @WebServlet 사용
- 프로그래밍 방식 -> AppInitV1Servlet.class 확인

# 초기화 과정
- @HandlesTypes("인터페이스 명") 초기화 인터페이스 지정
- ServletContainerInitializer 에 파라미터로 오는 Set<Class<?>> c에 초기화 할 클래스 정보 전달
- appInitClass.getDeclaredConstructor().newInstance()로 객체 생성
- appInit.onStartup(servletContext) 실행

# 연결 과정
- 스프링 컨테이너 생성 : AnnotationConfigWebApplicationContext
- MVC 디스패쳐 서블릿 생성 - 스프링 컨테이너 연결 : new DispatcherServlet(appContext)
- 디스패쳐 서블릿을 서블릿 컨테이너에 등록 : servletContext.addServlet()