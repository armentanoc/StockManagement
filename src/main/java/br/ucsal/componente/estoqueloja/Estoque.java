package br.ucsal.componente.estoqueloja;

import java.util.List;

public interface Estoque<T extends Estocavel> {

	void addProduto(T produto);
	
	void addProduto(Integer codigo, String nome, Integer quantidade);

	void removeProduto(T pr) throws NaoEncontrado;
	
	void removeProduto(Integer id) throws NaoEncontrado;

	Integer quantidadeProduto(T pq) throws NaoEncontrado;
	
	Integer quantidadeProduto(Integer id) throws NaoEncontrado;

	List<T> listarProdutos();
	
}