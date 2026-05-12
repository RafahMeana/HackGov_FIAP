package br.com.hackgov.dao;

import br.com.hackgov.model.Agendamento;
import java.sql.*;

public class AgendamentoDAO {
    private Connection connection;

    public AgendamentoDAO(Connection connection) {
        this.connection = connection;
    }

    public void criarAgendamento(Agendamento agendamento) throws SQLException {
        String sql = "INSERT INTO T_HG_AGENDAMENTO (id_cidadao, id_unidade, id_servico, dt_hora, nr_protocolo) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, agendamento.getIdCidadao());
            stmt.setInt(2, agendamento.getIdUnidade());
            stmt.setInt(3, agendamento.getIdServico());
            stmt.setTimestamp(4, Timestamp.valueOf(agendamento.getDataHora()));
            stmt.setString(5, agendamento.getProtocolo());
            stmt.executeUpdate();
        }
    }
}