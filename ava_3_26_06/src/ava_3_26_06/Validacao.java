package ava_3_26_06;

public class Validacao {
	
	public static void validarMensagem(String mensagem) {
		if (mensagem == null || mensagem.trim().isEmpty()) {
			throw new IllegalArgumentException("Mensagem não pode estar vazia!");
		}
	}
	
	public static void validarDestinatario(String destinatario) {
		if (destinatario == null || destinatario.trim().isEmpty()) {
			throw new IllegalArgumentException("Destinatário não pode ser vazio!");
		}
		
	}
	
	public static void validarEmail(String email) {
		if (!email.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9\\-]+(?:\\.[a-zA-Z0-9\\-]+)*\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("Email inválido!");
		}
	}		
	public static void validarTelefone(String telefone) {
		if (!telefone.matches("^\\(?\\d{2}\\)?\\s?\\d{4,5}-?\\d{4}$")) {
			throw new IllegalArgumentException("Telefone inválido!");
		}
		
	}		
	

}

/*
 * public static void validarTelefone(String telefone) {
    if (!telefone.matches("^\\(?\\d{2}\\)?\\s?\\d{4,5}-?\\d{4}$")) {
        throw new IllegalArgumentException("Telefone inválido!");
    }
}
*/
