package Kindle;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Livro[] vLivros = new Livro[50];
		Escritor[] vEscritores = new Escritor[30];
		Editora[] vEditoras = new Editora[10];
		Biblioteca[] vBiblioteca = new Biblioteca[50];
		Genero[] vGeneros = new Genero[100];

		Scanner leNumeros = new Scanner(System.in);
		Scanner leStrings = new Scanner(System.in);

		int continua = 1, opcao, i, aux1, aux2, aux3;
		int iLivros = 0, iEscritores = 0, iEditoras = 0, iBiblioteca = 0, iGeneros = 0;

		// System.out.println("Bem vindo ao E-book Play!");

		do {

			System.out.println("-------------Menu-------------");
			System.out.println("1 - Cadastrar livro");
			System.out.println("2 - Cadastrar escritor");
			System.out.println("3 - Cadastrar editora");
			System.out.println("4 - Adicionar Genêro");
			System.out.println("5 - Adicionar à biblioteca");
			System.out.println("6 - Listar livros");
			System.out.println("7 - Listar escritores");
			System.out.println("8 - Listar editoras");
			System.out.println("9 - Listar livros da biblioteca");
			System.out.println("10 - Listar Genêros");
			System.out.println("Digite o número da opção escolhida: ");
			opcao = leNumeros.nextInt();

			aux1 = -1;
			aux2 = -1;
			aux3 = -1;

			switch (opcao) {

			case 1:

				System.out.println("Nome do livro:");
				String nome = leStrings.nextLine();

				System.out.println("Número de páginas:");
				int nPaginas = leNumeros.nextInt();

				System.out.println("Ano de lançamento:");
				int ano = leNumeros.nextInt();

				System.out.println("Nome do autor:");
				String autor = leStrings.nextLine();

				for (i = 0; i < iEscritores; i++) {
					if (autor.equalsIgnoreCase(vEscritores[i].getNome())) {
						aux1 = i;
						break;
					}
				}

				if (aux1 == -1) {
					System.out.println("Autor não cadastrado!");
					System.out.println("Cadastre o autor para poder cadastrar o livro.");
					break;
				}

				System.out.println("Editora:");
				String editora = leStrings.nextLine();

				for (i = 0; i < iEditoras; i++) {
					if (editora.equalsIgnoreCase(vEditoras[i].getNome())) {
						aux2 = i;
						break;
					}
				}

				if (aux2 == -1) {
					System.out.println("Editora não cadastrada!");
					System.out.println("Cadastre a editora para poder cadastrar o livro.");
					break;
				}

				System.out.println("Genero:");
				String genero = leStrings.nextLine();

				for (i = 0; i < iGeneros; i++) {
					if (genero.equalsIgnoreCase(vGeneros[i].getGenero())) {
						aux3 = i;
						break;
					}
				}

				if (aux3 == -1) {
					System.out.println("Genêro não cadastrado");
					System.out.println("Cadastre o genêro para poder cadastrar o livro.");
					break;
				}

				vLivros[iLivros] = new Livro(nome, nPaginas, ano, vEscritores[aux1], vEditoras[aux2], vGeneros[aux3]);

				iLivros++;

				break;

			case 2:

				System.out.println("Nome do escritor:");
				nome = leStrings.nextLine();

				System.out.println("Idade:");
				int idade = leNumeros.nextInt();

				vEscritores[iEscritores] = new Escritor(nome, idade);

				iEscritores++;

				break;

			case 3:

				System.out.println("Nome da editora:");
				nome = leStrings.nextLine();

				vEditoras[iEditoras] = new Editora(nome);

				iEditoras++;

				break;

			case 4:

				System.out.println("Genêro:");
				nome = leStrings.nextLine();

				vGeneros[iGeneros] = new Genero(nome);

				iGeneros++;

				break;

			case 5:

				System.out.println("Nome do livro:");
				nome = leStrings.nextLine();

				for (i = 0; i < iLivros; i++) {
					if (nome.equalsIgnoreCase(vLivros[i].getNome())) {
						aux1 = i;
						break;
					}
				}

				if (aux1 == -1) {
					System.out.println("Livro não encontrado.");
					break;
				}

				vBiblioteca[iBiblioteca] = new Biblioteca();
				vBiblioteca[iBiblioteca].setLivros((vLivros[aux1]));

				iBiblioteca++;

				break;

			case 6:

				if (iLivros == 0)
					System.out.println("Nenhum Livro cadastrado!");

				for (i = 0; i < iLivros; i++) {
					System.out.println("Nome: " + vLivros[i].getNome() + "\tPáginas: " + vLivros[i].getNPaginas()
							+ "\tAno: " + vLivros[i].getAno());
					System.out.println("Autor: " + vLivros[i].getAutor().getNome() + "\tEditora: "
							+ vLivros[i].getEditora().getNome() + "\tGenero: " + vLivros[i].getGenero().getGenero());
				}

				break;

			case 7:

				if (iEscritores == 0)
					System.out.println("Nenhum escritor cadastrado!");

				for (i = 0; i < iEscritores; i++) {
					System.out.println("Nome: " + vEscritores[i].getNome() + "\tIdade: " + vEscritores[i].getIdade());
				}

				break;

			case 8:

				if (iEditoras == 0)
					System.out.println("Nenhuma editora cadastrada!");

				for (i = 0; i < iEditoras; i++) {
					System.out.println("Nome: " + vEditoras[i].getNome());
				}

				break;

			case 9:

				if (iBiblioteca == 0) {
					System.out.println("Nenhum livro na biblioteca");
					break;
				}

				for (i = 0; i < iBiblioteca; i++) {
					System.out.println("Nome: " + vBiblioteca[i].livros.getNome() + "\tPáginas: "
							+ vBiblioteca[i].livros.getNPaginas() + "\tAutor: "
							+ vBiblioteca[i].livros.getAutor().getNome()
							+ "\tGenêro: " + vBiblioteca[i].livros.getGenero().getGenero());

				}

				break;

			case 10:

				if (iGeneros == 0) {
					System.out.println("Nenhum genêro cadastrado");
					break;
				}

				System.out.println("\nGeneros: \n");

				for (i = 0; i < iGeneros; i++) {
					System.out.println(vGeneros[i].getGenero());
				}

				break;

			default:
				break;
			}

		} while (continua == 1);

	}

}
