package ava_3_26_06;

public class Notificacao {

	private String destinatario;

	public Notificacao(String destinatario) {
		Validacao.validarDestinatario(destinatario);
		this.destinatario = destinatario;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		Validacao.validarDestinatario(destinatario);
		this.destinatario = destinatario;
	}

	public void enviar(String mensagem) {
		System.out.println("");
		System.out.println("Mensagem: " + mensagem);
	}

}
