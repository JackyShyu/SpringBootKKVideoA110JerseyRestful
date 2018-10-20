package org.shyu.springboot.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.shyu.springboot.service.UserRestService;
import org.springframework.stereotype.Component;

@Component
public class UserJerseyConfiguration extends ResourceConfig {
	public UserJerseyConfiguration() {
		register(UserRestService.class);
	}
}
