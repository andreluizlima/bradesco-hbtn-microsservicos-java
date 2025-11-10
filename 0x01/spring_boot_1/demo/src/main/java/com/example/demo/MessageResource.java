package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping(value="/messages")
public class MessageResource {
	
	private final String MESSAGE = "BEM VINDO A AULA DE MICROSSERVIÇO USANDO SPRING BOOT !!!";
	private final String NO_USER_NO_PASS =  "USUÁRIO E SENHA NÃO INFORMADOS";

	private final String INVALID_USER_PASS =  "USUÁRIO E SENHA INVÁLIDOS";

	private final String SUCCESS =  "LOGIN EFETUADO COM SUCESSO !!!";

	@GetMapping("/simpleMessageWelcome")
	public String simpleMessageWelcome() {
	 
	  return MESSAGE;
	
	}
	
	@GetMapping("/login")
	public String login(@RequestParam String user, @RequestParam String password) {
	 
	  if(user == null || password == null || user.isBlank() || password.isBlank()) {
		  return NO_USER_NO_PASS;
	  }
	  
	  if(user.length() > 15 || password.length() > 15) {
		  return INVALID_USER_PASS;
	  }
	  
	  return SUCCESS;
	  
	}
	  
}
