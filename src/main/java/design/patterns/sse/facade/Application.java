package design.patterns.sse.facade;

import design.patterns.sse.facade.dto.ProdutoCarrinho;
import design.patterns.sse.facade.dto.ProdutoEmail;
import design.patterns.sse.facade.dto.ProdutoPesquisa;
import design.patterns.sse.facade.facade.Fachada;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

		Fachada fachada = new Fachada();
		List<ProdutoPesquisa> produtos = fachada.pesquisarProduto();
		produtos.forEach(System.out::println);

		System.out.println(fachada.consultarProduto(1).toString());

		List<ProdutoCarrinho> carrinho = fachada.visualizarCarrinho();
		carrinho.forEach(System.out::println);

		List<ProdutoEmail> ofertasEmail = fachada.receberOfertasEmail();
		ofertasEmail.forEach(System.out::println);
	}

}
