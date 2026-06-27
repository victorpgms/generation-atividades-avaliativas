package ava_2_26_06;

public class Carro {

	private String modelo;
	private int velocidade;

	public Carro(String modelo, int velocidade) {
		Validacao.validarVelocidade(velocidade);

		this.modelo = modelo;
		this.velocidade = velocidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		Validacao.validarVelocidade(velocidade);
		this.velocidade = velocidade;
	}

	public void acelerar(int valor) {
		Validacao.validarAceleracao(valor);
		this.velocidade += valor;
	}

	/*
	public void frear(int valor) {
		Validacao.validarFrenagem(valor);

		if (valor > this.velocidade) {
			this.velocidade = 0;
		} else {
			this.velocidade -= valor;
		}
	}
	*/

	public void visualizar() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Velocidade atual: " + this.velocidade + " km/h");
	}
}