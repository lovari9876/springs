** root-context 내용 참고

<?xml version="1.0" encoding="UTF-8"?>
<!-- 외부 라이브러리에서 받아온 클래스의 객체 생성해야 하는 것들! -->
<!-- namespace tab에서 문서 체크하고, 객체 생성 등록(bean)하여 쓴다. -->
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:mybatis-spring="http://mybatis.org/schema/mybatis-spring"
	xsi:schemaLocation="http://mybatis.org/schema/mybatis-spring http://mybatis.org/schema/mybatis-spring-1.2.xsd
		http://www.springframework.org/schema/beans https://www.springframework.org/schema/beans/spring-beans.xsd">

	<!-- Root Context: defines shared resources visible to all other web components -->

	<!-- connection pool -->
	<bean name="dataSource"
		class="org.springframework.jdbc.datasource.DriverManagerDataSource">
		<property name="driverClassName"
			value="oracle.jdbc.driver.OracleDriver" />
		<property name="url"
			value="jdbc:oracle:thin:@127.0.0.1:1521:XE" />
		<property name="username" value="scott" />
		<property name="password" value="tiger" />
	</bean>

	<!-- sqlSession을 생성하는 factory 객체 생성:(factory는 디자인패턴) -->
	<bean id="sqlSessionFactory"
		class="org.mybatis.spring.SqlSessionFactoryBean">
		<property name="dataSource" ref="dataSource" />
		<property name="mapperLocations"
			value="classpath:/sqlmap/*.xml" /> <!-- mapper xml읽어들인다 -->
		<!-- src/main/resouces 이후 위치 알려준다. -->
	</bean>

	<!-- *** 이것이 바로 mybatis!!! -->
	<!-- 생성자로 받는데, 첫번째 인자로 sqlSessionFactory 받아서 sqlSession 생성 -->
	<bean id="sqlSession"
		class="org.mybatis.spring.SqlSessionTemplate">
		<constructor-arg index="0" ref="sqlSessionFactory" />
	</bean>

	<!-- 3번과 4번 방식을 사용하기 위한 방식임 -->
	<!-- 3번: xml 읽는 대신에 Mapper Interface의 @어노테이션(sql문) 스캔!해서 객체 생성!! -->
	<!-- Mapper Interface -->
	<mybatis-spring:scan base-package="edu.bit.ex.*" />
	<!-- 이제 mybatis에서도 스캔함 -->

</beans>
