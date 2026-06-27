package ava_2_26_06;

public class CarroEletrico extends Carro {

	private int nivelBateria;

	private static final int CONSUMO_POR_ACELERACAO = 2;

	public CarroEletrico(String modelo, int velocidade, int nivelBateria) {
		super(modelo, velocidade);

		Validacao.validarNivelBateria(nivelBateria);
		this.nivelBateria = nivelBateria;
	}

	public int getNivelBateria() {
		return nivelBateria;
	}

	public void setNivelBateria(int nivelBateria) {
		Validacao.validarNivelBateria(nivelBateria);
		this.nivelBateria = nivelBateria;
	}

	@Override
	public void acelerar(int valor) {
		Validacao.validarAceleracao(valor);

		int consumoBateria = valor / CONSUMO_POR_ACELERACAO;

		Validacao.validarBateria(this.nivelBateria, consumoBateria);

		this.nivelBateria -= consumoBateria;
		this.setVelocidade(this.getVelocidade() + valor);
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Bateria restante: " + this.nivelBateria + "%");
	}
}