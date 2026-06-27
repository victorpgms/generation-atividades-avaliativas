package ava_3_26_06;

public class NotificacaoEmail extends Notificacao {

	public NotificacaoEmail(String destinatario) {
		super(destinatario);
		Validacao.validarEmail(destinatario);
	}
	
	@Override
	public void enviar(String mensagem) {
		Validacao.validarMensagem(mensagem);
		System.out.println("Email para " + getDestinatario());
		super.enviar(mensagem);
	}

}
