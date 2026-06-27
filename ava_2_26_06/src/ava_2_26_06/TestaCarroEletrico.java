package ava_2_26_06;

public class TestaCarroEletrico {

	public static void main(String[] args) {

		testarAceleracaoValida();
		testarAceleracaoInvalida();
		testarBateriaInsuficiente();
		testarBateriaNegativa();
		testarBateriaAcimaDe100();

	}

	public static void criarCarroEletrico(String modelo, int velocidade, int bateria, int aceleracao) {
		try {
			CarroEletrico carroEletrico = new CarroEletrico(modelo, velocidade, bateria);

			carroEletrico.acelerar(aceleracao);

			carroEletrico.visualizar();

		} catch (IllegalArgumentException error) {
			System.out.println("Erro: " + error.getMessage());
		}

		System.out.println("\n-------------------------");
	}

	public static void testarAceleracaoValida() {
		System.out.println("\nTeste: aceleração válida");

		criarCarroEletrico("BYD Dolphin mini", 0, 20, 30); //modelo, velocidade inicial, bateria e aceleração 
	}

	public static void testarAceleracaoInvalida() {
		System.out.println("\nTeste: aceleração inválida");

		criarCarroEletrico("BYD Shark", 0, 80, -10);//modelo, velocidade inicial, bateria e aceleração (Aceleração negativa) 
	}

	public static void testarBateriaInsuficiente() {
		System.out.println("\nTeste: bateria insuficiente");

		criarCarroEletrico("Tesla Model 3", 0, 10, 30);//modelo, velocidade inicial, bateria baixa e aceleração 
	}

	public static void testarBateriaNegativa() {
		System.out.println("\nTeste: nível de bateria negativo");

		criarCarroEletrico("BYD Dolphin mini", 0, -5, 10);//modelo, velocidade inicial, bateria negativa e aceleração 
	}

	public static void testarBateriaAcimaDe100() {
		System.out.println("\nTeste: nível de bateria acima de 100%");

		criarCarroEletrico("BYD Dolphin mini", 0, 120, 10);//modelo, velocidade inicial, bateria valor incorreto e aceleração 
	}
}