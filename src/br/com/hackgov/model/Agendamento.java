package br.com.hackgov.model;

import java.time.LocalDateTime;

public class Agendamento {
    private int id;
    private int idCidadao;
    private int idUnidade;
    private int idServico;
    private LocalDateTime dataHora;
    private String status;
    private String protocolo;

    public Agendamento() {}

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getIdCidadao() { return idCidadao; }
    public void setIdCidadao(int idCidadao) { this.idCidadao = idCidadao; }
    public int getIdUnidade() { return idUnidade; }
    public void setIdUnidade(int idUnidade) { this.idUnidade = idUnidade; }
    public int getIdServico() { return idServico; }
    public void setIdServico(int idServico) { this.idServico = idServico; }
    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getProtocolo() { return protocolo; }
    public void setProtocolo(String protocolo) { this.protocolo = protocolo; }
}