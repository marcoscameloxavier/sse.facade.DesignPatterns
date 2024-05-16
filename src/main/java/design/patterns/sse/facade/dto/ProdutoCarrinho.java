package design.patterns.sse.facade.dto;

public record ProdutoCarrinho(
        String nome,
        double preco,
        double frete,
        boolean isPrime,
        int quantidadeParcelas,
        String urlImagem,
        int quantidade
) {
}
