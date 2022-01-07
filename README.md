- **✅ Module 1 - Container, Dependency, and IoC**

  - <details>
      <summary>Question List</summary>
        <ul>
        <li> Question 01 - What is <em>dependency injection</em> and what are the advantages?</li>
        <li> Question 02 - What is a pattern? 
        What is an anti-pattern? 
        Is dependency injection a pattern?</li>
        <li> Question 03 - What is an interface and what are the advantages of making use of them in Java? 
        Why are they recommended for <em>Spring beans</em>?</li>
        <li> Question 04 - What is meant by <em>“application context</em>&quot;?</li>
        <li> Question 05 - What is the concept of a “container” and what is its lifecycle?</li>
        <li> Question 06 - How are you going to create a new instance of an <code>ApplicationContext</code>?</li>
        <li> Question 07 - Can you describe the lifecycle of a Spring Bean in an <code>ApplicationContext</code>?</li>
        <li> Question 08 - How are you going to create an <code>ApplicationContext</code> in an integration test?</li>
        <li> Question 09 - What is the preferred way to close an application context? 
        Does Spring Boot do this for you?</li>
        <li> Question 10 - Can you describe: Dependency injection using Java configuration? 
        Dependency injection using annotations (<code>@Component</code>, <code>@Autowired</code>)? 
        <em>Component scanning</em>, <em>Stereotypes</em> and <em>Meta-Annotations</em>? 
        <em>Scopes</em> for Spring beans? 
        What is the default scope?</li>
        <li> Question 11 - Are beans <em>lazily</em> or <em>eagerly</em> instantiated by default? 
        How do you alter this behavior?</li>
        <li> Question 12 - What is a property source? 
        How would you use <code>@PropertySource</code>?</li>
        <li> Question 13 - What is a <code>BeanFactoryPostProcessor</code> and what is it used for? 
        When is it invoked? 
        Why would you define a static <code>@Bean</code> method? 
        What is a <code>ProperySourcesPlaceholderConfigurer</code> used for?</li>
        <li> Question 14 - What is a <code>BeanPostProcessor</code> and how is it different to a <code>BeanFactoryPostProcessor</code>? 
        What do they do?
        When are they called? 
        What is an initialization method and how is it declared on a Spring bean? 
        What is a destroy method, how is it declared and when is it called?
        Consider how you enable JSR-250 annotations like <code>@PostConstruct</code> and <code>@PreDestroy</code>? 
        When/how will they get called?
        How else can you define an initialization or destruction method for a Spring bean?</li>
        <li> Question 15 - What does <em>component-scanning</em> do?</li>
        <li> Question 16 - What is the behavior of the annotation <code>@Autowired</code> with regards to 
        <em>field injection</em>, <em>constructor injection</em> and <em>method injection</em>?</li>
        <li> Question 17 - What do you have to do, if you would like to inject something into a private field? 
        How does this impact testing?</li>
        <li> Question 18 - How does the <code>@Qualifier</code> annotation complement the use of <code>@Autowired</code>?</li>
        <li> Question 19 - What is a <strong><em>proxy object</em></strong> and what are the two different types of proxies Spring can create? 
        What are the limitations of these proxies (per type)? 
        What is the power of a proxy object and where are the disadvantages?</li>
        <li> Question 20 - What are the advantages of Java Config? 
        What are the limitations?</li>
        <li> Question 21 - What does the <code>@Bean</code> annotation do?</li>
        <li> Question 22 - What is the default bean id if you only use @Bean? 
        How can you override this?</li>
        <li> Question 23 - Why are you not allowed to annotate a final class with <code>@Configuration</code>? 
        How do <code>@Configuration</code> annotated classes support singleton beans? 
        Why can’t <code>@Bean</code> methods be final either?</li>
        <li> Question 24 - How do you configure <strong><em>profiles</em></strong>? 
        What are possible use cases where they might be useful?</li>
        <li> Question 25 - Can you use <code>@Bean</code> together with <code>@Profile</code>?</li>
        <li> Question 26 - Can you use <code>@Component</code> together with <code>@Profile</code>?</li>
        <li> Question 27 - How many profiles can you have?</li>
        <li> Question 28 - How do you inject scalar/literal values into Spring beans?</li>
        <li> Question 29 - What is <code>@Value</code> used for?</li>
        <li> Question 30 - What is Spring Expression Language (<strong><em>SpEL</em></strong> for short)?</li>
        <li> Question 31 - What is the Environment abstraction in Spring?</li>
        <li> Question 32 - Where can properties in the environment come from there are many sources for properties check the documentation if not sure. 
        Spring Boot adds even more.</li>
        <li> Question 34 - What is the difference between <code>$</code> and <code>#</code> in <code>@Value</code> expressions?</li>
      </ul>
    </details>

- **✅ Module 02 - Aspect Oriented Programming**

  - <details>
      <summary>Question List</summary>
      <ul>
        <li>Question 01 - What is the concept of AOP? 
        Which problem does it solve? 
        What is a <em>cross cutting concern</em>? 
        Name three typical cross cutting concerns. 
        What two problems arise if you don&#39;t solve a cross cutting concern via AOP?</li>
        <li>Question 02 - What is a <strong><em>pointcut</em></strong>, a <strong><em>JoinPoint</em></strong>, an <strong><em>advice</em></strong>, an <strong><em>aspect</em></strong>, <strong><em>weaving</em></strong>?</li>
        <li>Question 03 - How does Spring solve (implement) a cross cutting concern?</li>
        <li>Question 04 - Which are the limitations of the two proxy-types? 
        What visibility must Spring bean methods have to be proxied using Spring AOP?</li>
        <li>Question 05 - How many advice types does Spring support. 
        Can you name each one?
        What are they used for?
        Which two advices can you use if you would like to try and catch exceptions?</li>
        <li>Question 06 - What do you have to do to enable the detection of the <code>@Aspect</code> annotation? 
        What does <code>@EnableAspectJAutoProxy</code> do?</li>
        <li>Question 07 - If shown pointcut expressions, would you understand them? 
        For example, what would be the correct pointcut expression to match both getter and setter methods?</li>
        <li>Question 08 - What is the JoinPoint argument used for?</li>
        <li>Question 09 - What is a <code>ProceedingJoinPoint</code>? When is it used?</li>
      </ul>
    </details>

- **✅ Module 03 - Data Management JDBC, Transactions, JPA, Spring Data**

  - <details>
        <summary>Question List</summary>
        <ul>
        <li><p>Question 02 - How do you configure a <code>DataSource</code> in Spring?
        Which bean is very useful for development/test databases?</p>
        </li>
        <li><p>Question 03 - What is the <code>Template</code> design pattern and what is the <code>JdbcTemplate</code>?</p>
        </li>
        <li><p>Question 04 - What is a <strong><em>callback</em></strong>?
        What are the three <code>JdbcTemplate</code> callback interfaces that can be used with queries?
        What is each used for?</p>
        </li>
        <li><p>Question 05 - Can you execute plain SQL statement with the <code>JdbcTemplate</code>?</p>
        </li>
        <li><p>Question 06 - When does the <code>JdbcTemplate</code> acquire (and release) a connection,
        for every method called or once per template? Why?</p>
        </li>
        <li><p>Question 07 - How does the <code>JdbcTemplate</code> support generic queries?<br>How does it return objects and <code>lists</code>/<code>maps</code> of objects?<br>query(), queryForObject(), queryForList(), queryForRowSet() and queryForMap(): Map<String, Object></p>
        </li>
        <li><p>Question 09 - Is a transaction a cross cutting concern?<br>How is it implemented by Spring</p>
        </li>
        <li><p>Question 10 - How are you going to define a transaction in Spring?<br>What does <code>@Transactional</code> do?<br>What is the <code>PlatformTransactionManager</code>?</p>
        </li>
        <li><p>Question 11 - Is the <code>JdbcTemplate</code> able to participate in an existing transaction?</p>
        </li>
        <li><p>Question 12 - What is a transaction isolation level?<br>How many do we have and how are they ordered?
        <code>@Transactional(isolation = Isolation.XXXXXX)</code></p>
        </li>
        <li><p>Question 13 - What is <code>@EnableTransactionManagement</code> for?</p>
        </li>
        <li><p>Question 14 - What does transaction propagation mean?</p>
        </li>
        <li><p>Question 15 - What happens if one <code>@Transactional</code> annotated method is calling another<br><code>@Transactional</code> annotated method on the same object instance?</p>
        </li>
        <li><p>Question 16 - Where can the <code>@Transactional</code> annotation be used?<br>What is a typical usage if you put it at class level?</p>
        </li>
        <li><p>Question 17 - What does declarative transaction management mean?</p>
        </li>
        <li><p>Question 18 - What is the default rollback policy?<br>How can you override it?</p>
        </li>
        <li><p>Question 19 - What is the default rollback policy in a JUnit test, when you use the
        <code>@RunWith(SpringJUnit4ClassRunner.class)</code> in JUnit 4 or
        <code>@ExtendWith(SpringExtension.class)</code> in JUnit 5,
        and annotate your <code>@Test</code> annotated method with <code>@Transactional</code>?</p>
        </li>
        <li><p>Question 20 - Why is the term &quot;unit of work&quot; so important and why does JDBC <code>AutoCommit</code><br>violate this pattern?</p>
        </li>
        <li><p>Question 21 - What do you need to do in Spring if you would like to work with <code>JPA</code>?</p>
        </li>
        <li><p>Question 22 - Are you able to participate in a given transaction in Spring while working with JPA?</p>
        </li>
        <li><p>Question 23 - Which <code>PlatformTransactionManager</code>(s) can you use with JPA?</p>
        </li>
        <li><p>Question 24 - What do you have to configure to use JPA with Spring?<br>How does Spring Boot make this easier?</p>
        </li>
        <li><p>Question 25 - What is repository interface? <code>@Repository</code> and <code>extends CrudRepository&lt;T, ID&gt;</code></p>
        </li>
        <li><p>Question 26 - How do you define a Repository interface? 
        Why is it an interface not a class?</p>
        </li>
        <li><p>Question 27 - What is the naming convention for finder methods in a <code>Repository</code> interface?</p>
        </li>
        <li><p>Question 28 - How are Spring Data repositories implemented by Spring at runtime?</p>
        </li>
        <li><p>Question 29 - What is <code>@Query</code> used for?</p>
        </li>
        </ul>
      </details>

- **✅ Module 04 – Spring Boot**

  - <details>
      <summary>Question List</summary>
        <ul>
        <li>Question 01 - What is Spring Boot?</li>
        <li>Question 02 - What are the advantages of using Spring Boot?</li>
        <li>Question 03 - Why is it &quot;<em>opinionated</em>&quot;?</li>
        <li>Question 04 - What things affect what Spring Boot sets up?</li>
        <li>Question 05 - What is a Spring Boot starter <code>POM</code>? Why is it useful?</li>
        <li>Question 06 - Spring Boot supports both properties and <code>YML</code> files. Would you recognize and understand them if you saw them?</li>
        <li>Question 07 - Can you control logging with Spring Boot? How?</li>
        <li>Question 08 - Where does Spring Boot look for property file by default?</li>
        <li>Question 09 - How do you define profile specific property files?</li>
        <li>Question 10 - How do you access the properties defined in the property files?</li>
        <li>Question 11 - What properties do you have to define in order to configure external MySQL?</li>
        <li>Question 12 - How do you configure default schema and initial data?</li>
        <li>Question 13 - What is a <strong>fat jar</strong>? How is it different from the original jar?</li>
        <li>Question 14 - What is the difference between an embedded container and a <code>WAR</code>?</li>
        <li>Question 15 - What embedded containers does Spring Boot support?</li>
        <li>Question 16 - How does Spring Boot know what to configure?</li>
        <li>Question 17 - What does <code>@EnableAutoConfiguration</code> do?</li>
        <li>Question 18 - What does <code>@SpringBootApplication</code> do?</li>
        <li>Question 19 - Does Spring Boot do component scanning? Where does it look by default?</li>
        <li>Question 20 - How are <code>DataSource</code> and <code>JdbcTemplate</code> autoconfigured?</li>
        <li>Question 21 - What is <code>spring.factories</code> file for?</li>
        <li>Question 22 - How do you customize Spring auto configuration?</li>
        <li>Question 23 - What are the examples of <code>@Conditional</code> annotations? How are they used?</li>
        <li>Question 24 - What value does Spring Boot <em>Actuator</em> provide?</li>
        <li>Question 25 - What are the two protocols you can use to access actuator endpoints?</li>
        <li>Question 26 - What are the actuator endpoints that are provided out of the box?</li>
        <li>Question 27 - What is <code>info</code> endpoint for? How do you supply data?</li>
        <li>Question 28 - How do you change logging level of a package using loggers endpoint?</li>
        <li>Question 29 - How do you access an endpoint using a <code>tag</code>?</li>
        <li>Question 30 - What is metrics for?</li>
        <li>Question 31 - How do you create a custom metric with or without tags?</li>
        <li>Question 32 - What is <code>Health</code> Indicator?</li>
        <li>Question 33 - What are the Health Indicators that are provided out of the box?</li>
        <li>Question 34 - What is the Health Indicator status?</li>
        <li>Question 35 - What are the Health Indicator statuses that are provided out of the box?</li>
        <li>Question 36 - How do you change the Health Indicator status severity order?</li>
        <li>Question 37 - Why do you want to leverage 3rd-party external monitoring system?</li>
        <li>Question 38 - When do you want to use <code>@SpringBootTest</code> annotation?</li>
        <li>Question 39 - What does <code>@SpringBootTest</code> auto-configure?</li>
        <li>Question 40 - What dependencies does <code>spring-boot-starter-test</code> brings to the classpath?</li>
        <li>Question 41 - How do you perform <em>integration testing</em> with <code>@SpringBootTest</code> for a web application?</li>
        <li>Question 42 - When do you want to use <code>@WebMvcTest</code>? What does it auto-configure?</li>
        <li>Question 43 - What are the differences between <code>@MockBean</code> and <code>@Mock</code>?</li>
        <li>Question 44 - When do you want use <code>@DataJpaTest</code> for? What does it auto-configure?</li>
        </ul>
    </details>

- **✅ Module 05 - Spring MVC and The Web Layer**

  - <details>
      <summary>Question List</summary>
      <ul>
        <li>Question 01 - <code>MVC</code> is an abbreviation for a design pattern.<br>What does it stand for and what is the idea behind it?</li>
        <li>Question 02 - What is the <code>DispatcherServlet</code> and what is it used for?</li>
        <li>Question 03 - What is a web application context?<br>What extra scopes does it offer? <code>@RequestScope</code>, <code>@SessionScope</code>, <code>@ApplicationScope</code></li>
        <li>Question 04 - What is the <code>@Controller</code> annotation used for?</li>
        <li>Question 05 - How is an incoming request mapped to a controller and mapped to a method?</li>
        <li>Question 06 - What is the difference between <code>@RequestMapping</code> and <code>@GetMapping</code>?</li>
        <li>Question 07 - What is <code>@RequestParam</code> used for?</li>
        <li>Question 08 - What are the differences between <code>@RequestParam</code> and <code>@PathVariable</code>?</li>
        <li>Question 09 - What are some of the parameter types for a controller method?<ul>
        <li>WebRequest, NativeWebRequest</li>
        <li><code>javax.servlet.ServletRequest</code></li>
        <li><code>javax.servlet.ServletResponse</code></li>
        <li><code>javax.servlet.http.HttpSession</code></li>
        <li><code>javax.servlet.http.PushBuilder</code></li>
        <li><code>java.security.Principal</code></li>
        <li><code>HttpMethod</code>: GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE</li>
        <li><code>java.util.Locale</code></li>
        <li><code>java.util.TimeZone</code> and <code>java.time.ZoneId</code></li>
        <li><code>java.io.InputStream</code> and <code>java.io.Reader</code></li>
        <li><code>java.io.OutputStream</code> and <code>java.io.Writer</code></li>
        <li><code>HttpEntity&lt;B&gt;</code></li>
        <li><code>java.util.Map</code>, <code>org.springframework.ui.Model</code>, <code>org.springframework.ui.ModelMap</code></li>
        <li><code>RedirectAttributes</code></li>
        <li><code>Errors</code>, <code>BindingResult</code></li>
        <li><code>SessionStatus</code> + class-level <code>@SessionAttributes</code></li>
        <li><code>UriComponentsBuilder</code></li>
        <li><code>@RequestParam</code></li>
        </ul>
        </li>
        <li>Question 10 - What other annotations might you use on a controller method parameter?<ul>
        <li><code>@RequestParam</code></li>
        <li><code>@PathVariable</code></li>
        <li><code>@MatrixVariable</code></li>
        <li><code>@CookieValue</code></li>
        <li><code>@RequestHeader</code></li>
        <li><code>@RequestBody</code></li>
        <li><code>@RequestPart</code></li>
        <li><code>@RequestAttribute</code></li>
        <li><code>@ModelAttribute</code></li>
        <li><code>@SessionAttribute</code></li>
        <li><code>@SessionAttributes</code></li>
        </ul>
        </li>
        <li>Question 11 - What are some of the valid return types of a controller method?<ul>
        <li><code>@ResponseBody</code></li>
        <li><code>HttpEntity&lt;B&gt;</code>, <code>ResponseEntity&lt;B&gt;</code></li>
        <li><code>HttpHeaders</code></li>
        <li><code>String</code></li>
        <li><code>View</code> return instance of views such as <code>JstlView</code>, <code>ThymeleafView</code>, <code>FreeMarkerView</code></li>
        <li><code>Map</code>, <code>Model</code></li>
        <li><code>@ModelAttribute</code></li>
        <li><code>ModelAndView</code></li>
        <li><code>void</code></li>
        <li><code>DeferredResult&lt;V&gt;</code></li>
        <li><code>Callable&lt;V&gt;</code></li>
        <li><code>ListenableFuture&lt;V&gt;</code>, <code>CompletableFuture&lt;V&gt;</code>, <code>CompletionStage&lt;V&gt;</code></li>
        <li><code>ResponseBodyEmitter</code>, <code>SseEmitter</code></li>
        <li><code>StreamingResponseBody</code></li>
        <li>Reactive types</li>
        </ul>
        </li>
        </ul>
    </details>

- **⬜ Module 06 – Security**

  - <details>
      <summary>Question List</summary>
    </details>

- **⬜ Module 07 – REST**

  - <details>
      <summary>Question List</summary>
    </details>

- **⬜ Module 08 – Testing**

  - <details>
      <summary>Question List</summary>
    </details>
