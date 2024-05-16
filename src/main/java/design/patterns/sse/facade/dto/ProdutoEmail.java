package design.patterns.sse.facade.dto;

public record ProdutoEmail(
        String nome,
        double preco,
        String urlImagem
) {
}
