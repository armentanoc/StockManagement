package estoqueloja;

import br.ucsal.componente.estoqueloja.Estocavel;
import br.ucsal.componente.estoqueloja.Estoque;
import br.ucsal.componente.estoqueloja.NaoEncontrado;

public class Sistema {

	// O sistema depende das abstrações Estoque e Estocavel e não das implementações
	// Injeção de dependência (@Autowired, @Inject)
	// Spring boot orienta a não fazer assim, mas sim a colocar no construtor
	// A performance é melhor do que na anotação, mas outra questão é padronizar o
	// código e o código fica mais livre do sprint boot, é menos uma dependência

	private Estoque<Estocavel> e;

	public Sistema(Estoque estoque) {
		e = estoque;
		e.addProduto(1, "Bola", 10);
		e.addProduto(2, "Skate", 20);
		try {
			e.removeProduto(1);
		} catch (NaoEncontrado e1) {
			System.out.println(e1.getMessage());
		}
		try {
			System.out.println("Produto: " + e.quantidadeProduto(2));
		} catch (NaoEncontrado e1) {
			System.out.println(e1.getMessage());
		}

		for (Estocavel a : e.listarProdutos()) {
			System.out.println(a);
		}
	}
}
