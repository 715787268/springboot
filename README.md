# springboot  


# thymeleaf 
thymeleaf是一个视图模板,和springmvc配置
与spring结合配置如下:
web.xml
<?xml version="1.0" encoding="UTF-8"?>  
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://java.sun.com/xml/ns/javaee"   
xsi:schemaLocation="http://java.sun.com/xml/ns/javaee   
http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd" id="WebApp_ID" version="3.0">  
  <display-name>zoo</display-name>  
  
  <servlet>  
    <servlet-name>springMVC</servlet-name>  
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>  
    <init-param>  
      <param-name>contextConfigLocation</param-name>  
      <param-value>classpath:spring-mvc.xml</param-value>  
    </init-param>  
    <load-on-startup>1</load-on-startup>  
  </servlet>  
  
  <servlet-mapping>  
    <servlet-name>springMVC</servlet-name>  
    <url-pattern>*.html</url-pattern>  
  </servlet-mapping>  
    
  <welcome-file-list>  
    <welcome-file>index.html</welcome-file>  
    <welcome-file>index.htm</welcome-file>  
    <welcome-file>index.jsp</welcome-file>  
    <welcome-file>default.html</welcome-file>  
    <welcome-file>default.htm</welcome-file>  
    <welcome-file>default.jsp</welcome-file>  
  </welcome-file-list>  
</web-app>


依赖pom.xml：
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com</groupId>
	<artifactId>spring-thymeleaf</artifactId>
	<packaging>war</packaging>
	<version>0.0.1-SNAPSHOT</version>
	<name>spring-thymeleaf Maven Webapp</name>
	<url>http://maven.apache.org</url>
	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.compile.version>1.8</project.compile.version>
		<spring.version>4.1.7.RELEASE</spring.version>
		<fastjson-version>1.2.21</fastjson-version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>com.alibaba</groupId>
			<artifactId>fastjson</artifactId>
			<version>${fastjson-version}</version>
		</dependency>
		<dependency>
			<groupId>org.thymeleaf</groupId>
			<artifactId>thymeleaf-spring4</artifactId>
			<version>2.1.3.RELEASE</version>
		</dependency>

		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.12</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>commons-fileupload</groupId>
			<artifactId>commons-fileupload</artifactId>
			<version>1.3.1</version>
		</dependency>
		<dependency>
			<groupId>org.apache.tomcat</groupId>
			<artifactId>servlet-api</artifactId>
			<version>6.0.29</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>org.apache.tomcat</groupId>
			<artifactId>jsp-api</artifactId>
			<version>6.0.29</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-log4j12</artifactId>
			<version>1.7.7</version>
		</dependency>

		<!-- spring -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-core</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-web</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webmvc</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context-support</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-expression</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-aop</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-aspects</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-test</artifactId>
			<version>${spring.version}</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>aopalliance</groupId>
			<artifactId>aopalliance</artifactId>
			<version>1.0</version>
		</dependency>

		<!-- dao -->
		<dependency>
			<groupId>org.mybatis</groupId>
			<artifactId>mybatis-spring</artifactId>
			<version>1.2.3</version>
		</dependency>
		<dependency>
			<groupId>org.mybatis</groupId>
			<artifactId>mybatis</artifactId>
			<version>3.2.7</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-jdbc</artifactId>
			<version>${spring.version}</version>
		</dependency>
<!-- 		<dependency> -->
<!-- 			<groupId>com.alibaba</groupId> -->
<!-- 			<artifactId>druid</artifactId> -->
<!-- 			<version>1.0.11</version> -->
<!-- 		</dependency> -->



		<dependency>
			<groupId>javax.servlet.jsp.jstl</groupId>
			<artifactId>jstl-api</artifactId>
			<version>1.2</version>
			<exclusions>
				<exclusion>
					<groupId>javax.servlet</groupId>
					<artifactId>servlet-api</artifactId>
				</exclusion>
				<exclusion>
					<groupId>javax.servlet.jsp</groupId>
					<artifactId>jsp-api</artifactId>
				</exclusion>
			</exclusions>
		</dependency>

		<dependency>
			<groupId>org.glassfish.web</groupId>
			<artifactId>jstl-impl</artifactId>
			<version>1.2</version>
			<exclusions>
				<exclusion>
					<groupId>javax.servlet</groupId>
					<artifactId>servlet-api</artifactId>
				</exclusion>
				<exclusion>
					<groupId>javax.servlet.jsp</groupId>
					<artifactId>jsp-api</artifactId>
				</exclusion>
				<exclusion>
					<groupId>javax.servlet.jsp.jstl</groupId>
					<artifactId>jstl-api</artifactId>
				</exclusion>
			</exclusions>
		</dependency>
		<dependency>
			<groupId>org.thymeleaf</groupId>
			<artifactId>thymeleaf</artifactId>
			<version>2.1.3.RELEASE</version>
		</dependency>
	</dependencies>
	<build>
		<finalName>spring-thymeleaf</finalName>
		<plugins>
			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.3</version>
				<configuration>
					<source>${project.compile.version}</source>
					<target>${project.compile.version}</target>
					<encoding>${project.build.sourceEncoding}</encoding>
				</configuration>
			</plugin>
		</plugins>
	</build>
</project>



spring-mvc配置：
	<?xml version="1.0" encoding="UTF-8"?>  
<beans xmlns="http://www.springframework.org/schema/beans"  
    xmlns:mvc="http://www.springframework.org/schema/mvc"  
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  
    xmlns:context="http://www.springframework.org/schema/context"  
    xsi:schemaLocation="http://www.springframework.org/schema/beans  
        http://www.springframework.org/schema/beans/spring-beans.xsd  
        http://www.springframework.org/schema/context  
        http://www.springframework.org/schema/context/spring-context.xsd  
        http://www.springframework.org/schema/mvc  
        http://www.springframework.org/schema/mvc/spring-mvc.xsd">  
    
  
  <!-- spring扫描com.zoo.web.controller下面所有带注解的类 -->  
  
  <context:component-scan base-package="com.thyme.controller"/>  
  <!-- 这个标签表示使用注解来驱动 -->  
  <mvc:annotation-driven/>  
  <!-- 默认servlet -->  
  <mvc:default-servlet-handler />  
  
  
  <!-- 使用thymeleaf解析 -->  
  <bean id="templateResolver"  
        class="org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver">  
    <property name="prefix" value="/WEB-INF/templates/" />  
    <property name="suffix" value=".html" />  
    <property name="templateMode" value="HTML5" />  
<!--     <property name="templateMode" value="HTML" />   -->
    <property name="cacheable" value="false" />  
  </bean>  
      
  <bean id="templateEngine"  
        class="org.thymeleaf.spring4.SpringTemplateEngine">  
    <property name="templateResolver" ref="templateResolver" />  
  </bean>  
  
  <bean class="org.thymeleaf.spring4.view.ThymeleafViewResolver">  
    <property name="templateEngine" ref="templateEngine" />  
    <property name="characterEncoding" value="UTF-8"/>
  </bean>  
  
</beans>
这里有别于jsp和freemarker的是有个templateMode的属性
这个属性的作用用于识别html，一般填HTML5，这里我填html报错不知道是不是版本原因


controller
package com.thyme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController
{

    @RequestMapping("/test")
    public String testThyme(Model model){
        model.addAttribute("user", new User());
        return "test";
    }
    @RequestMapping("/html")
    public String html(){
        return "html";
    }
    
    
    class User{
        private String username = "test";
        private String password = "testpwd";
        public String getUsername()
        {
            return username;
        }
        public void setUsername(String username)
        {
            this.username = username;
        }
        public String getPassword()
        {
            return password;
        }
        public void setPassword(String password)
        {
            this.password = password;
        }
        
        
    }
}

test.html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
</head>
<body>
<p>测试th:value</p>
<input type="text" name="userName" value="James Carrot" th:value="${user.username}" />
<p>测试th:text</p>
<div th:text="${user.password}"></div>
<p>测试th:fragment th:include </p>
<div th:include="html :: template1"></div> 
<div th:replace="html :: template1"></div> 
</body>
</html>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Insert title here</title>
</head>
<body>
<div th:fragment="template1">这是一个模板</div>
</body>
</html>
浏览器输入  http://localhost:8080/spring-thymeleaf/test.html 即可看到输出结果


这里尝试了标签内文本输出th:text，含value属性的标签赋值th:value 模板标签th:include/th:replace
模板还可以使用sitemesh
