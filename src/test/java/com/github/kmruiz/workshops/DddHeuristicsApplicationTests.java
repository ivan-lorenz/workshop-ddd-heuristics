package com.github.kmruiz.workshops;

import com.github.kmruiz.workshops.domain.RegistableUser;
import com.github.kmruiz.workshops.domain.UserService;
import com.github.kmruiz.workshops.domain.events.RegisteredUserEvent;
import com.github.kmruiz.workshops.domain.user.UserImpl;
import com.github.kmruiz.workshops.infrastructure.IRegistry;
import com.github.kmruiz.workshops.infrastructure.Registry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DddHeuristicsApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void shouldRegisterAUser() {
		RegistableUser user = new UserImpl("1","userName");
		RegisteredUserEvent event = user.createRegisteredUser("password");

		IRegistry registry = new Registry();
		registry.save(event);
		assertThat("A user shoul be registered", registry.getState().size(), is(1));
	}

	@Test
	public void shouldRegisterAUserUsingService() {
		UserService service = new UserService(new Registry());
		RegisteredUserEvent event = service.createRegisteredUser(new UserImpl("1", "username"));
		assertThat("A Registered user event should be emitted", null != event);
	}

}
