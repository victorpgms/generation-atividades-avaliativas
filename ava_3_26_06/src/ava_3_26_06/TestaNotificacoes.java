package ava_3_26_06;


public class TestaNotificacoes {

	public static void main(String[] args) {

		criarNotificacaoEmailValido();

		criarNotificacaoSmsValido();
		
		criarNotificacoesDestinatariosInvalidos();

		criarNotificacoesVazias();

		criarNotificacoesSemDestinatarios();

		criarNotificacoesTipoInválido();

	}

	public static void criarNotificacao(int tipo, String destinatario, String mensagem) {

		switch (tipo) {

		// 1 = email e 2 = SMS
		case 1:
			try {
				NotificacaoEmail notificacao = new NotificacaoEmail(destinatario);

				notificacao.enviar(mensagem);

			} catch (IllegalArgumentException error) {
				System.out.println("Erro: " + error.getMessage());
			}
			break;

		case 2:
			try {
				NotificacaoSMS notificacao = new NotificacaoSMS(destinatario);

				notificacao.enviar(mensagem);

			} catch (IllegalArgumentException error) {
				System.out.println("Erro: " + error.getMessage());
			}

			break;

		default:
			System.out.println("Tipo de destinatário inválido! 1 para E-mail ou 2 para SMS.");

		}

	}

	public static void criarNotificacaoEmailValido() {
		criarNotificacao(1, "victor.teste@teste.com.br", "Olá, esse é um email válido!");
		System.out.println("\n-------------------------------------------------------");

	}

	public static void criarNotificacaoSmsValido() {
		criarNotificacao(2, "11 99999-9999", "Olá, esse é um SMS válido!");
		System.out.println("\n-------------------------------------------------------");

	}

	public static void criarNotificacoesDestinatariosInvalidos() {
		criarNotificacao(1, "victor.testeteste.com.br", "Email para destinatário inválido"); // DESTINATÁRIO INVÁLIDO
		criarNotificacao(2, "11 99000-0999-9999", "SMS para destinatário inválido"); // DESTINATÁRIO INVÁLIDO
		System.out.println("\n-------------------------------------------------------");
	}

	public static void criarNotificacoesVazias() {
		criarNotificacao(1, "victor.teste@teste.com.br", ""); // MENSAGEM EMAIL VAZIA
		criarNotificacao(2, "11 99999-9999", " ");// MENSAGEM SMS VAZIA
		System.out.println("\n-------------------------------------------------------");
	}

	public static void criarNotificacoesSemDestinatarios() {
		criarNotificacao(1, " ", "Email sem destinátario"); // EMAIL SEM DESTINATARIO
		criarNotificacao(2, " ", "SMS sem destinátario");// SMS SEM DESTINATARIO
		System.out.println("\n-------------------------------------------------------");
	}

	public static void criarNotificacoesTipoInválido() {
		criarNotificacao(9, "victor.teste@teste.com.br", "TIPO INVÁLIDO"); // TIPO DE NOTIFICAÇÃO INVÁLIDO
		criarNotificacao(0, "11 99999-9999", "TIPO INVÁLIDO"); // TIPO DE NOTIFICAÇÃO INVÁLIDO
		System.out.println("\n-------------------------------------------------------");
	}


}
