package org.shyu.springboot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.shyu.springboot.model.User;
import org.shyu.springboot.model.Users;
import org.springframework.stereotype.Service;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="users")
@Path("/users")
@Service
public class UserRestService {
	private static Map<Integer, User> usersDB = new HashMap<>();
	static {
		User user1 = new User(1, "Jacky", "Shyu");
		User user2 = new User(2, "Lee", "Roden");
		usersDB.put(1, user1);
		usersDB.put(2, user2);
	}
	
	@GET
	//@Produces("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Users getAllUsers() {
		Users users = new Users();
		users.setUsers(new ArrayList<>(usersDB.values()));
		return users;
	}
}
