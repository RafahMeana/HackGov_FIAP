package br.com.hackgov.dao;

import br.com.hackgov.model.Cidadao;
import java.sql.*;

public class CidadaoDAO {
    private Connection connection;

    public CidadaoDAO(Connection connection) {
        this.connection = connection;
    }

    public void cadastrar(Cidadao cidadao) throws SQLException {
        String sql = "INSERT INTO T_HG_CIDADAO (nr_cpf, nm_cidadao, nr_cartao_sus) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cidadao.getCpf());
            stmt.setString(2, cidadao.getNome());
            stmt.setString(3, cidadao.getCartaoSus());
            stmt.executeUpdate();
        }
    }
}