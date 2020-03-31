package Kindle;

public class Escritor {

	private String nome;
	private int idade;

	public Escritor(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return this.idade;
	}

}
