package ava_2_26_06;

public class Validacao {

	public static void validarVelocidade(int velocidade) {
		if (velocidade < 0) {
			throw new IllegalArgumentException("Atenção! Velocidade não pode ser negativa!");
		}
	}

	/*
	public static void validarFrenagem (int frenagem) {
		if (frenagem <= 0) {
			throw new IllegalArgumentException("Atenção! O valor da frenagem deve ser maior do que zero!");
		}
	}
	*/
	
	public static void validarNivelBateria (int bateria) {
		if (bateria < 0 || bateria > 100) {
			throw new IllegalArgumentException("Atenção! O nível de bateria deve estar entre 0 a 100!");
		}
	}
	
	public static void validarAceleracao (int aceleracao) {
		if (aceleracao <= 0) {
			throw new IllegalArgumentException("Atenção! A Aceleração deve ser maior do que ZERO!");
		}
	}

	public static void validarBateria (int nivelBateria, int consumoBateria) {
		if (consumoBateria > nivelBateria) {
			throw new IllegalArgumentException("Atenção! Nível de bateria insuficiente!");
		}		
		
	}
	
	

	
	
}
