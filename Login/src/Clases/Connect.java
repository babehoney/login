/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author DeveloperTwo
 */
public class Connect {
    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;

     public void ConectarBasedeDatos(){
         try {
             final String Controlador = "com.mysql.jdbc.Driver";
             Class.forName( Controlador );
             final String url_bd = "jdbc:mysql://localhost:3306/login";
             conexion = DriverManager.getConnection(url_bd,"root","");
             sentencia = conexion.createStatement();
         } catch (ClassNotFoundException | SQLException ex) {
             JOptionPane.showMessageDialog(null,ex.getMessage(), "Aplicacion", JOptionPane.ERROR_MESSAGE);
          }
     }
     public void DesconectarBasedeDatos() {
        try {
            if (conexion != null ) {
                if(sentencia != null) {
                    sentencia.close();
                }
                conexion.close();
            }
        }
        catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,ex.getMessage(), "Aplicacion", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
      public Connection getConnection(){
      return conexion;
   }
}
