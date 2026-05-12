package br.com.hackgov.model;

public class Unidade {
    private int id;
    private String nome;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cep;

    public Unidade() {}
    public Unidade(String nome, String logradouro, String numero, String bairro, String cep) {
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getLogradouro() { return logradouro; }
    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }
    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }
}