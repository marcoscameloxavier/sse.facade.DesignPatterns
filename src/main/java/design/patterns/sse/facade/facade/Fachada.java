package design.patterns.sse.facade.facade;

import design.patterns.sse.facade.dto.ProdutoCarrinho;
import design.patterns.sse.facade.dto.ProdutoEmail;
import design.patterns.sse.facade.dto.ProdutoPesquisa;
import design.patterns.sse.facade.entity.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Fachada {

    private List<ProdutoPesquisa> produtosEmEstoque;
    private List<ProdutoCarrinho> produtosCarrinho;
    private List<ProdutoEmail> ofertasEmail;

    public Fachada() {

        this.produtosEmEstoque = new ArrayList<ProdutoPesquisa>();
        this.produtosEmEstoque.add(new ProdutoPesquisa("Produto 1", 100.0, 10.0, true, 12, "url1", 4.5, 100));
        this.produtosEmEstoque.add(new ProdutoPesquisa("Produto 2", 200.0, 20.0, false, 6, "url2", 4.0, 200));
        this.produtosEmEstoque.add(new ProdutoPesquisa("Produto 3", 300.0, 30.0, true, 3, "url3", 3.5, 300));

        this.produtosCarrinho = new ArrayList<ProdutoCarrinho>();
        this.produtosCarrinho.add(new ProdutoCarrinho("Produto 1", 100.0, 10.0, true, 12, "url1", 1));
        this.produtosCarrinho.add(new ProdutoCarrinho("Produto 2", 200.0, 20.0, false, 6, "url2", 2));

        this.ofertasEmail = new ArrayList<ProdutoEmail>();
        this.ofertasEmail.add(new ProdutoEmail("Nitendo Swuitch", 2199.90, "https://m.media-amazon.com/images/I/81hxAgURvcL.__AC_SX300_SY300_QL70_ML2_.jpg"));
        this.ofertasEmail.add(new ProdutoEmail("Fone de Ouvido JBL 2145-85", 198.90, "https://m.media-amazon.com/images/I/41USVyfHHgL._AC_SX466_.jpg"));
        this.ofertasEmail.add(new ProdutoEmail("Smartphone Galaxy S22", 2199.90, "https://m.media-amazon.com/images/I/71i2XhHU3pL._AC_SX466_.jpg"));
        this.ofertasEmail.add(new ProdutoEmail("Smartwatch Galaxy Watch 4", 198.90, "https://m.media-amazon.com/images/I/41USVyfHHgL._AC_SX466_.jpg"));
        this.ofertasEmail.add(new ProdutoEmail("Fone de Ouvido JBL 2145-85", 198.90, "https://m.media-amazon.com/images/I/41USVyfHHgL._AC_SX466_.jpg"));
    }


    public Produto consultarProduto(int id) {
        Produto produto = new Produto("Fone de Monitoramento Vocal Modelo HIGH Retorno", 198.90, true);
        produto.setFabricante("audiovoicer");
        produto.setMarca("audiovoicer");
        produto.setModelo("HIGH Retorno");
        produto.setDescricao("Fone de Monitoramento Vocal Modelo HIGH Retorno Auditivo Audiovoicer Retorno Vocal Acústico Feedback Vocal Para Treino vocal Monitor Vocal");
        produto.setUrlImagem("https://m.media-amazon.com/images/I/41USVyfHHgL._AC_SX466_.jpg");
        produto.setRating(4.5);
        produto.setQuantidadeComprasUltimoMes(100);
        produto.setQuantidadeParcelas(12);
        produto.setComentarios(List.of("Produto excelente", "Produto de qualidade"));
        return produto;
    }

    public List<ProdutoCarrinho> visualizarCarrinho() {
        return this.produtosCarrinho;
    }

    public List<ProdutoPesquisa> pesquisarProduto() {
       return this.produtosEmEstoque;
    }

    public List<ProdutoEmail> receberOfertasEmail() {
        return this.ofertasEmail;
    }
}
