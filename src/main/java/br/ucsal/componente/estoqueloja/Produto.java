package br.ucsal.componente.estoqueloja;

public class Produto implements Estocavel {

	private Integer id;
	private String nome;
	private Integer quantidade;
	
	
	public Produto() {
	}
	
	public Produto(Integer id, String nome, Integer quantidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return String.format("Produto [id=%s, nome=%s, quantidade=%s]", id, nome, quantidade);
	}

}
