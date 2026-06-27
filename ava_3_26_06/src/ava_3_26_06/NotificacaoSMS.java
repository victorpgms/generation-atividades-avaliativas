package ava_3_26_06;

public class NotificacaoSMS extends Notificacao {

	public NotificacaoSMS(String destinatario) {
		super(destinatario);
		Validacao.validarTelefone(destinatario);
	}
	
	@Override
	public void enviar(String mensagem) {
		Validacao.validarMensagem(mensagem);
		System.out.println("SMS para " + getDestinatario());
		super.enviar(mensagem);
	}

	
}
