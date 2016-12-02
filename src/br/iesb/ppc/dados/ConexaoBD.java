package br.iesb.ppc.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConexaoBD {
    
    public static Connection getConexao() throws DadosException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "elementaryos");
        } catch (ClassNotFoundException e) {
             System.out.println(e.getMessage());
            throw new DadosException("Erro ao carregar JDBC: " + e.getMessage());
        } catch (SQLException e) {
             System.out.println(e.getMessage());
            throw new DadosException("Erro ao conectar com SGBD: " + e.getMessage());
        }
    }

}