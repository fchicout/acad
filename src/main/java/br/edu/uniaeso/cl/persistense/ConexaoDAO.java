import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    public Connection connectaBD(){
        Connection conn = null;

        try {
           String url = "jdbc:mysql://localhost:3306/bancoteste?user=root&password=";
           //trocar o nome do banco
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro){
            JoptionPane.showMessageDialog(null, erro.getMessage());
        }

        return conn;
    }

}