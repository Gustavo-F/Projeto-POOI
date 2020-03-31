package Kindle;

public class Livro {

	private String nome;
	private int nPaginas;
	private int ano;
	private Escritor autor;
	private Editora editora;
	private Genero genero;
	
	public Livro(String nome, int nPaginas, int ano, Escritor autor, Editora editora, Genero genero) {

		this.nome = nome;
		this.nPaginas = nPaginas;
		this.ano = ano;
		this.autor = autor;
		this.editora = editora;
		this.genero = genero;

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}

	public int getNPaginas() {
		return nPaginas;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}

	public void setAutor(Escritor autor) {
		this.autor = autor;
	}

	public Escritor getAutor() {
		return autor;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
}






















