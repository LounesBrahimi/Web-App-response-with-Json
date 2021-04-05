package com.lounes.data;

import java.util.Arrays;
import java.util.List;

import com.lounes.beans.User;

public class UserService {
	public List<User> getUsers(){
		return Arrays.asList(new User(1, "Lounes", "Brahimi", "leduc@gmail.com"),
							new User(2, "Inès", "ducance", "inès@gmail.com"));
	}
}
