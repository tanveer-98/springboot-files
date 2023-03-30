Ctrl + shift + F = Format Code
Ctrl + 1 to generate getters and setters
ctrl+alt+down to copy lines
Ctrl + space = search dependencies

In spring :

- Bean : In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container

Ways to Inject values into entities

#####method 1 : value as element

```xml
 <bean name="emp"
		class="com.tanveer.spring.springcore.Employee" >
		<property name="id">
			<value>20</value>
		</property>

		<property name="name">
			<value>Tanveer</value>
		</property>
	</bean>
```

#####Method 2: value as attribute

```xml
 <bean name="emp"
		class="com.tanveer.spring.springcore.Employee"  >
		<property name="id" value ="20">

		</property>

		<property name="name" value = "Tanveer">
		</property>
	</bean>
```

#####method 3 to inject values
using p:schema

```xml
xmlns:p="http://www.springframework.org/schema/p"

<bean name="emp"
		class="com.tanveer.spring.springcore.Employee"
		 p:id="20" p:name="Tanveer"
		 >

	</bean>
```

--- Ref as Attribute and P Schema

<bean name="student" class="com.tanveer.spring.springcore.ref.Student" p:scores-ref="scores"/>

---

### LIFE CYCLE METHODS SUMMARY

init
destroy
XML Configuration
init-method
destroy-method

Method 2 : Annotations
@PostConstruct
@PreDestroy

Method 3 : Spring Interfaces
InitializingBean
DisposableBean

---

###BEAN SCOPES
scopes is the availabilty of objects in a container

- singleton

default is singleton

only one object is created

- prototype
  container will create different objects everytime

- session
  only for spring mvc applications

object is created till the user is logged in and then destroyed after he log outs

- request
  relevant for only spring MVC applications

an object is created per user request

- globalsession
  **Not important**

---

#### Summary of Dependency Check

Using the spring dependency it's to check features so that we can ensure that a particualr object for sure gets what is requires

---

##### Constructor Injection

```xml
<constructor-arg>
<value>
b
</value>
</constructor-arg>

<!-- Or using ref -->

<contructor-arg>
<ref bean = "a">
</contructor-arg>

```

##### Methods to write constructor injection xml

method 3 : using c schema

```xml
xmlsns:c="http://www.springframework.org/schema/c"

<bean
class ="com.xx"
name="employee" c:id="123"
c:id="123" c:address-ref ="address"
>


</bean>


```
