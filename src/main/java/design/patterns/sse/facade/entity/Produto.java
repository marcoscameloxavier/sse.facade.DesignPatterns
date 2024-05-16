package design.patterns.sse.facade.entity;

import java.util.List;

public class Produto {
    private String nome;
    private double preco;
    private String fabricante;
    private String descricao;
    private String marca;
    private String modelo;
    private List<String> comentarios;
    private double frete;
    private boolean isPrime;
    private int quantidadeParcelas;
    private double rating;
    private String urlImagem;
    private int quantidadeComprasUltimoMes;

    public Produto(String nome, double preco, boolean isPrime) {
        this.nome = nome;
        this.preco = preco;
        this.isPrime = isPrime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }

    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }


    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public int getQuantidadeComprasUltimoMes() {
        return quantidadeComprasUltimoMes;
    }

    public void setQuantidadeComprasUltimoMes(int quantidadeComprasUltimoMes) {
        this.quantidadeComprasUltimoMes = quantidadeComprasUltimoMes;
    }

    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' + '\n' +
                ", preco=" + preco +
                ", fabricante='" + fabricante + '\'' +'\n' +
                ", descricao='" + descricao + '\'' +'\n' +
                ", marca='" + marca + '\'' +'\n' +
                ", modelo='" + modelo + '\'' +'\n' +
                ", comentarios=" + comentarios +'\n' +
                ", frete=" + frete +'\n' +
                ", isPrime=" + isPrime +'\n' +
                ", quantidadeParcelas=" + quantidadeParcelas +'\n' +
                ", rating=" + rating +'\n' +
                ", urlImagem='" + urlImagem + '\'' +'\n' +
                ", quantidadeComprasUltimoMes=" + quantidadeComprasUltimoMes +
                '}';
    }

}
