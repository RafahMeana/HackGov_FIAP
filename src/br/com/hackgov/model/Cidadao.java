package br.com.hackgov.model;

public class Cidadao {
    private int id;
    private String cpf;
    private String nome;
    private String cartaoSus;

    public Cidadao() {}
    public Cidadao(String cpf, String nome, String cartaoSus) {
        this.cpf = cpf;
        this.nome = nome;
        this.cartaoSus = cartaoSus;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCartaoSus() { return cartaoSus; }
    public void setCartaoSus(String cartaoSus) { this.cartaoSus = cartaoSus; }
}