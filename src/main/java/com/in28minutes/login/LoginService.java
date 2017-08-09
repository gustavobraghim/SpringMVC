package com.in28minutes.login;

import org.springframework.stereotype.Service;

//criando um serviço (aqui ligamos a dependency injection)
@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("gustavo") && password.equals("daitan");
	}

}