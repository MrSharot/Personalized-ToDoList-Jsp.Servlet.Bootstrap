package com.mushfiqur.rahman.login;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("sharot") && password.equals("sharot");
	}

	public boolean isUserValid(String name, String password) {
		return name.equalsIgnoreCase("sharot") && password.equals("sharot");
	}

}