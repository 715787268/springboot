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


springboot + swagger API文档生成

在开发过程中，后端提供服务给前端调用或者给测试使用，而前端就需要了解api怎样调用，按照之前的项目开发模式，我们都是开发自己写api的word文档， 这样做有几个弊端，一个是文档不好维护，如果api有变更，还得重新修改文档太麻烦；二是如果撰写的风格不一样，文档阅读性差文档，而且容易遗漏，三是不方便立即测试。
而使用swagger，它提供的注解和ui页面能很好地解决这些麻烦，让开发更高效、专注。
spring boot引入swagger添加依赖
<dependency>
           <groupId>io.springfox</groupId>
           <artifactId>springfox-swagger2</artifactId>
           <version>2.2.2</version>
        </dependency>
        <dependency>
           <groupId>io.springfox</groupId>
           <artifactId>springfox-swagger-ui</artifactId>
           <version>2.2.2</version>
        </dependency>
再启动类Application.class上加入@EnableSwagger2开启swagger注解
swagger注解详解
@Api 用在类上，对该类的功能描述说明 如@Api("用户服务")
@ApiOperation 用在方法上，对该方法的功能描述 如@ApiOperation("用户注册服务")
@ApiImplicitParams 用在方法上，对多个请求参数的描述，
    @ApiImplicitParams({
        @ApiImplicitParam(),@ApiImplicitParam()
    })
@ApiImplicitParam对一个参数的描述，有几个属性
paramType：请求参数的位置，具体值如下
query为查询，相当于请求是?key=value这类型的，对应请求注解@PathParam
path 相当于rest参数/{userId}/这种，对应请求注解@PathVariable
header参数位于请求头，应该是做权限验证之类的，@RequestHeader
body用于post请求提交对象@RequestBody

defaultValue：参数默认值，这个是给swagger-ui设置的默认值，方便测试
name :参数名称 ?key=value的key
value：参数注释/说明，在swagger-ui上显示
dataType：参数的数据类型 如 String
required：参数是否为必传参数
以下是无关紧要的
allowableValues：参数范围，以区间展示如{@code range[1, 5]}, {@code range(1, 5)}, {@code range[1, 5)}或者{@code range[1, infinity]}左闭右开
allowMultiple：该参数是否可以通过多次出现接受多个值。大概是可变参数的意思？

@ApiResponses用在方法上，对多个响应的描述，
  如  @ApiResponses({
        @ApiResponse(code=400,message="请求参数没填好"),
        @ApiResponse(code=401,message="请求未被授权"),
        @ApiResponse(code=401,message="请求被阻止"),
        @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
 有点需要注意：api接口需要注明方法类型如method=RequestMethod.GET，否则swagger-ui会把所有请求类型列出来
 
 package com.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api("用户服务")
@RestController
@RequestMapping("/user")
public class UserController
{

    @ApiOperation("用户注册")
    @ApiImplicitParams({
        @ApiImplicitParam(paramType="query",defaultValue="user123",required=true,dataType="String",name="username",value="用户名"),
        @ApiImplicitParam(paramType="query",defaultValue="password123",required=true,dataType="String",name="pwd",value="密码")
    })
    @ApiResponses({
        @ApiResponse(code=400,message="请求参数没填好"),
        @ApiResponse(code=401,message="请求未被授权"),
        @ApiResponse(code=403,message="请求被阻止"),
        @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value= "/register", method=RequestMethod.GET)
    public Map<String,String> register(String username,String pwd){
        Map<String, String> resultMap= new HashMap<>();
        resultMap.put("msg", "200");
        resultMap.put("username", username);
        resultMap.put("pwd", pwd);
        return resultMap;
    }
    
    @ApiOperation(value = "用户登录", notes = "用户登录,需要输入用户名和密码")
    @ApiImplicitParams({
        @ApiImplicitParam(paramType="body",defaultValue="{\"username\":\"test\",\"pwd\":\"123456\"}",required=true,dataType="String",name="user",value="用户"),
    })
    @ApiResponses({
        @ApiResponse(code=400,message="请求参数没填好"),
        @ApiResponse(code=401,message="请求未被授权"),
        @ApiResponse(code=403,message="请求被阻止"),
        @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value= "/login", method=RequestMethod.POST)
    public Map<String,String> login(@RequestBody Map<String, String> user){
        return user;
    }
}

pom.xml

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com</groupId>
	<artifactId>springboot</artifactId>
	<packaging>war</packaging>
	<version>0.0.1-SNAPSHOT</version>
	<name>springboot Maven Webapp</name>
	<url>http://maven.apache.org</url>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.compile.version>1.8</project.compile.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
			<version>1.5.1.RELEASE</version>
		</dependency>
		
		<dependency>
           <groupId>io.springfox</groupId>
           <artifactId>springfox-swagger2</artifactId>
           <version>2.2.2</version>
        </dependency>
        <dependency>
           <groupId>io.springfox</groupId>
           <artifactId>springfox-swagger-ui</artifactId>
           <version>2.2.2</version>
        </dependency>
	</dependencies>
	<build>
		<finalName>springboot</finalName>
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
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>
</project>


package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
}
