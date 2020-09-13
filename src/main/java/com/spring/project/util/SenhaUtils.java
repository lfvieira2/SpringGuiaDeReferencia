package com.spring.project.util;

public class SenhaUtils {
	
	/**
	 * Gera um hash utilizando o BCrypt.
	 * 
	 * @param senha
	 * @return String
	 */
	
	// Descomentar depencia no pom.xml
	/*
	public static String gerarBCrypt(String senha) {
		if (senha == null) {
			return senha;
		}

		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.encode(senha);
	}*/
	
	 /**
	 * Verifica se a senha é válida. 
	 * 
	 * @param senha
	 * @param senhaEncoded
	 * @return boolean
	 */
	 
	/*
	public static boolean senhaValida(String senha, String senhaEncoded) {
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.matches(senha, senhaEncoded);
	}
	
	*/
}
