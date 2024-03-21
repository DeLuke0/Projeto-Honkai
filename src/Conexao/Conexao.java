package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    // declaração de variáveis
    public Connection conn; 
    public String url = "jdbc:mysql://localhost:3306/Honkai"; 
    public String user = "root";
    public String password = "#Montanha0";
    // Comando para conectar com o BD
    public boolean conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Falha na conexão com o banco " + ex.getMessage());
            return false;
        }
    }
    // Comando para desconectar do BD
    public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
        
        }
    }
}
