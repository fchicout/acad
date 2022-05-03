package br.edu.uniaeso.cl.persistense.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDados {

    private final static String driver = "com.mysql.jdbc.Driver";
    private final static String url = "jdbc:mysql://localhost:3306/teste?user=root&password=";

    public static Connection getConnection() {
        Connection conexao = null;
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url);

        } catch (SQLException ex) {
            System.out.println("Sua conexão foi mal sucedida");
        } catch (ClassNotFoundException excecao) {
            System.out.println("Drive não encontrado");
        }
        return conexao;
    }

    public void closeConnection(Connection conexao) {
        try {
            if (!conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException exe) {
            System.out.println("Conexão nao foi fechada" + exe.getMessage());
        }
    }

}
