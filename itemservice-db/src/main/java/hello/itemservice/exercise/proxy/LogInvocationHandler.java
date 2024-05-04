package hello.itemservice.exercise.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogInvocationHandler implements InvocationHandler {

	private final Object target;

	public LogInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		log.info("실행 전 로그");
		Object result = method.invoke(target, args);
		log.info("실행 후 로그");
		return result;
	}
}
// 출처: https://vprog1215.tistory.com/394 [백엔드 개발역량을 높이자:티스토리]