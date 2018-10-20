package org.shyu.springboot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.shyu.springboot.model.User;
import org.shyu.springboot.model.Users;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="users")
@Path("/users")
public class UserRestService {
	private static Map<Integer, User> usersDB = new HashMap<>();
	static {
		User user1 = new User(1, "Jacky", "Shyu");
		User user2 = new User(2, "Lee", "Roden");
		usersDB.put(1, user1);
		usersDB.put(2, user2);
	}
	
	public Users getAllUsers() {
		Users users = new Users();
		users.setUsers(new ArrayList<>(usersDB.values()));
		return users;
	}
}
