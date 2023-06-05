package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author wellersonelucas
 */
public class Conexao {
    public static Connection fazConexao() throws SQLException{
        System.out.println("");
        try{
            Class.forName("com.mysql.jdbc.Driver");

            return DriverManager.getConnection("jdbc:mysql://localhost/db_leafless", "root","lusim123");

        }catch(ClassNotFoundException e){

            throw new SQLException(e.getException());
        }

    }
}
