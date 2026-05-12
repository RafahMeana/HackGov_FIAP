package br.com.hackgov.dao;

import br.com.hackgov.model.Unidade;
import java.sql.*;

public class UnidadeDAO {
    private Connection connection;

    public UnidadeDAO(Connection connection) {
        this.connection = connection;
    }

    public void cadastrar(Unidade unidade) throws SQLException {
        String sql = "INSERT INTO T_HG_UNIDADE (nm_unidade, nm_logradouro, nr_numero, nm_bairro, nr_cep) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, unidade.getNome());
            stmt.setString(2, unidade.getLogradouro());
            stmt.setString(3, unidade.getNumero());
            stmt.setString(4, unidade.getBairro());
            stmt.setString(5, unidade.getCep());
            stmt.executeUpdate();
        }
    }
}