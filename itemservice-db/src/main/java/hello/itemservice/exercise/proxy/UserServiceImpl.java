package hello.itemservice.exercise.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserServiceImpl implements UserServiceInterface {
	@Override
	public void save() {
		log.info("save user info");
	}
}