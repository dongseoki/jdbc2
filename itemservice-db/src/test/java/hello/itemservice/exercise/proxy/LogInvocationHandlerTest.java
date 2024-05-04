package hello.itemservice.exercise.proxy;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Proxy;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class LogInvocationHandlerTest {

	@Test
	void LogTest () {
		UserServiceInterface target = new UserServiceImpl();
		LogInvocationHandler logInvocationHandler = new LogInvocationHandler(target);
		UserServiceInterface proxy = (UserServiceInterface) Proxy.newProxyInstance(UserServiceInterface.class.getClassLoader(), new Class[]{UserServiceInterface.class}, logInvocationHandler);
		proxy.save();
		log.info("target class = {}", target.getClass());
		log.info("proxy class = {}", proxy.getClass());

	}
	// 출처: https://vprog1215.tistory.com/394 [백엔드 개발역량을 높이자:티스토리]
}