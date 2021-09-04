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

- **⬜ Module 03 - Data Management JDBC, Transactions, JPA, Spring Data**
  - <details>
    <summary>Question List</summary>
  </details>

- **⬜ Module 04 – Spring Boot**
  - <details>
    <summary>Question List</summary>
  </details>

- **⬜ Module 05 - Spring MVC and The Web Layer**
  - <details>
    <summary>Question List</summary>
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