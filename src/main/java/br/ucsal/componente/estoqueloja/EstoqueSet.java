package br.ucsal.componente.estoqueloja;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EstoqueSet implements Estoque<Produto> {

	private Set<Produto> produtos = new HashSet();

	public EstoqueSet() {
	}

	@Override
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}

	private Produto getProduto(Produto pr) {
		Produto p = null;
		for (Produto produto : produtos) {
			if (pr.getId() == produto.getId()) {
				p = produto;
			}
		}
		return p;
	}

	@Override
	public void removeProduto(Produto pr) throws NaoEncontrado {
		Estocavel p = getProduto(pr);
		if (p != null) {
			produtos.remove(p);
		} else {
			throw new NaoEncontrado();
		}
	}

	@Override
	public Integer quantidadeProduto(Produto pq) throws NaoEncontrado {
		Produto p = getProduto(pq);
		if (p != null) {
			return p.getQuantidade();
		} else {
			throw new NaoEncontrado();
		}
	}

	@Override
	public List<Produto> listarProdutos() {
		// copia dessa lista
		return Collections.unmodifiableList(new ArrayList(this.produtos));
	}

	@Override
	public void addProduto(Integer codigo, String nome, Integer quantidade) {
		this.addProduto(new Produto(quantidade, nome, quantidade));

	}

	@Override
	public void removeProduto(Integer id) throws NaoEncontrado {
		removeProduto(new Produto(id, null, null));
	}

	@Override
	public Integer quantidadeProduto(Integer id) throws NaoEncontrado {
		return quantidadeProduto(new Produto(id, null, null));
	}
}
