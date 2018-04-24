# Spring-BeanDIExample
This project is meant to give an understanding on Types of Bean Dependency in Spring 


As an example of creating the simpler module to let users understand the Different types of Bean Dependency in Spring. The project contains 2 POJO java class files , 1 Spring bean configuration file & 1 parent file with psvm to invoke both the parent & the Dependent class using respective injection types.

1. Address : This POJO class contains different fields for Address.

2. Person : This POJO class is the invoker of the Dependent class i.e. Address 

  (a) Constructor based injection : The Address class is included in the Person class' constructor as an argument.
  (b) Setter based injection : The Address class is included in the Setter method of the parent class.
 
3. beanConfig.xml : This file is meant to define both the bean with their respective id & class. This config file is very important in the sense that it allows us to opt for either type of Bean injection type at a time.

4. DITest : This class picks up the bean configuration file and directs Spring container to use the DI capability as per our required code change. 
