 1. First JVM gets loaded
1. Main method gets executed
1. ApplicationContext is loaded
1. ApplicationContext reads xml configuration file
1. ApplicationContext pre-loads one object for each bean in the config file.
1. lazy-init="true" -- This informs spring container not to pre-load object for this bean
 1. By default spring early loads objects in memory
 For lazy-init beans object is created only when the getBean() method is called
 1. For pre-init beans getBean() returns the reference of the pre-loaded object
1. By default only one object for every bean is created(singleton)
1. singleton: Atleast one object for every class but not more than or object
1. Spring for lazy-init beans creates a singleton object on firstcall of getBeans() method
1.  and then uses that object for future getBean() method calls.
 
 ------------------------------------
 
 ##Prototype
 1. Prototype beans are default lazy-init
 1. Prototypes are not singleton 
 1. A new object is created for prototype when getBean() method is called every time.
 
 ```java
 	/<bean id="act" class="com.chainsys.projectA.beans.Actor" scope="prototype"></bean>
```
---
## Bean with parameterize constructor
 
 ```java
 	 <bean id="film" class="com.chainsys.projectA.beans.Movie">
 	<constructor-arg type="java.lang.String" value="Vikram" />
 	<constructor-arg type="java.lang.String" value="Lokesh" />
 </bean>
 ```
## Factory method
```java
  <bean id="nvsilunch" class="com.chainsys.projectA.beans.Lunch" factory-method="createNonVegSouthIndianLunch" factory-bean = "lf"/>
    <bean id="vsilunch" class="com.chainsys.projectA.beans.Lunch" factory-method="createVegSouthIndianLunch" factory-bean = "lf"/>
    <bean id="nilunch" class="com.chainsys.projectA.beans.Lunch" factory-method="createNorthIndianLunch" factory-bean = "lf"/>
    <bean id="chlunch" class="com.chainsys.projectA.beans.Lunch" factory-method="createChineseIndianLunch" factory-bean = "lf"/>
```