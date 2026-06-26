package ava_1_26_06;

public class Validacao {
	
	public static void validarNome (String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome não pode ser vazio!");
		}
	}
	
	public static void validarEmail (String email) {
		if (!email.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9\\-]+(?:\\.[a-zA-Z0-9\\-]+)*\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("Digite um email válido!");
		}
	}

	//public static void validarNivelAcesso (String nivelAcesso) {}
	
	
	
	
	
	
}
