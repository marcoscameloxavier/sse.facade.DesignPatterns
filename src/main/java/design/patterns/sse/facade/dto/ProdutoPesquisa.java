package design.patterns.sse.facade.dto;

public record ProdutoPesquisa(
        String nome,
        double preco,
        double frete,
        boolean isPrime,
        int quantidadeParcelas,
        String urlImagem,
        double rating,
        int quantidadeComprasUltimoMes
) {
}
