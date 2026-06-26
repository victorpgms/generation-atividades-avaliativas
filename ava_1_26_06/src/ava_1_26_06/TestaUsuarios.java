package ava_1_26_06;

import java.util.ArrayList;
import java.util.List;

public class TestaUsuarios {

	public static void main(String[] args) {

		testarUsuarioValido();
		testarAdministradorValido();
		testarNomeInvalido();
		testarEmailInvalido();
		testarListaUsuarios();

	}

	public static void testarUsuarioValido() {
		System.out.println("\nTeste: criação de usuário válido");

		try {
			
			Usuario usuario = new Usuario("Victor Pedro", "victor.pedro@teste.com");
			usuario.visualizar();

		} catch (IllegalArgumentException error) {
			System.err.println("Erro: " + error.getMessage());
		}
	}

	
	public static void testarAdministradorValido() {
		System.out.println("\nTeste: criação de administrador válido ");

		try {

			Administrador administrador = new Administrador("Aimee", "aimee123@teste.com", "MÁXIMO");
			administrador.visualizar();

		} catch (IllegalArgumentException error) {
			System.err.println("Erro: " + error.getMessage());
		}
	}

	
	public static void testarNomeInvalido() {
		System.out.println("\nTeste: validação de nome inválido");

		try {
			
			Usuario usuario = new Usuario("", "teste@teste.com");
			usuario.visualizar();

		} catch (IllegalArgumentException error) {
			System.err.println("Erro: " + error.getMessage());
		}
	}

	
	
	public static void testarEmailInvalido() {
		System.out.println("\nTeste: validação de e-mail inválido");

		try {
			Usuario usuario = new Usuario("Luci", "emailERRADO");
			usuario.visualizar();

		} catch (IllegalArgumentException error) {
			System.err.println("Erro: " + error.getMessage());
		}
	}

	public static void testarListaUsuarios() {
		System.out.println("\nTeste: LIATA DE USUÁRIOS CADASTRADOS:");

		List<Usuario> listaUsuarios = new ArrayList<>();

		try {
			
			//ADD USUARIOS JA NA LISTA
			listaUsuarios.add(new Usuario("Victor Pedro", "victor.pedro@teste.com"));
			listaUsuarios.add(new Usuario("João Matheus", "joao.matheus@teste.com"));
			listaUsuarios.add(new Administrador("Aimee", "aimee123@teste.com", "MÁXIMO"));
			listaUsuarios.add(new Administrador("Rafael", "rafael123@teste.com", "MÁXIMO"));

			//VISUALIZAR TODOS
			for (Usuario usuario : listaUsuarios) {
				System.out.println("----------------------");
				usuario.visualizar();
			}

		} catch (IllegalArgumentException error) {
			System.err.println("Erro: " + error.getMessage());
		}
		

	}
}