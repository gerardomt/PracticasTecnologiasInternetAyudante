package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import beans.Usuario;
/**
 *
 * @author gerardomt
 */
public class Modelo {
    
    public Connection getConnection(){
        Connection cn= null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/tecInternet", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e ){
            e.printStackTrace();
        }
        return cn;
    }
    
    public void insertUsuario(Usuario usuario){
        try {
            Connection con = getConnection();
            String query = "INSERT INTO tecInternet.usuario (nombre, contrasena, correo) VALUES ('" + 
                    usuario.getUsuario() + "','" + usuario.getPassword() + "','" + usuario.getEmail() +  "');";
            Statement st = con.createStatement();
            st.execute(query);
            con.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
        
    public Usuario getUsuario(String nombre){
        Usuario response = null; 
        try {
            Connection con = getConnection();
            String query = "SELECT nombre, contrasena, correo FROM tecInternet.usuario WHERE nombre = '" +
                    nombre + "';";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                response = new Usuario(rs.getString("nombre"), rs.getString("contrasena"), rs.getString("correo"));
            }
            con.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return response;
    }
}
