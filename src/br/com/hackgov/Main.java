package br.com.hackgov;

import br.com.hackgov.factory.ConnectionFactory;
import br.com.hackgov.model.*;
import br.com.hackgov.dao.*;
import java.time.LocalDateTime;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            System.out.println("Conexão estabelecida com sucesso.");

            // 1. Cadastrar Cidadão
            Cidadao cidadao = new Cidadao("12345678901", "João da Silva", "700000000000001");
            new CidadaoDAO(conn).cadastrar(cidadao);

            // 2. Cadastrar Unidade (Normalizada)
            Unidade unidade = new Unidade("UBS Central", "Av. Paulista", "1100", "Bela Vista", "01310100");
            new UnidadeDAO(conn).cadastrar(unidade);

            // 3. Criar Agendamento
            Agendamento agenda = new Agendamento();
            agenda.setIdCidadao(1); // Supondo que o ID gerado foi 1
            agenda.setIdUnidade(1);
            agenda.setIdServico(1); // Consulta Médica Geral (conforme script SQL anterior)
            agenda.setDataHora(LocalDateTime.of(2026, 5, 20, 10, 0));
            agenda.setProtocolo("HG-2026-001");

            new AgendamentoDAO(conn).criarAgendamento(agenda);

            System.out.println("Processo concluído com segurança e persistência.");

        } catch (Exception e) {
            System.err.println("Erro na operação: " + e.getMessage());
        }
    }
}