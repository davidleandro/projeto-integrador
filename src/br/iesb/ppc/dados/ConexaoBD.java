package br.iesb.ppc.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class ConexaoBD {
    
    public static Connection getConexao() throws DadosException {
        String jdbc = "jdbc:mysql://localhost:3306/mydb";
        
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "123");
        properties.setProperty("useSSL", "false");
        properties.setProperty("autoReconnect", "true");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(jdbc, properties);
        } catch (ClassNotFoundException e) {
             System.out.println(e.getMessage());
            throw new DadosException("Erro ao carregar JDBC: " + e.getMessage());
        } catch (SQLException e) {
             System.out.println(e.getMessage());
            throw new DadosException("Erro ao conectar com SGBD: " + e.getMessage());
        }
    }

}
