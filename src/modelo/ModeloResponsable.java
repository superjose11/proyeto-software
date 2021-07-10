/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import clases.Conexion;
import clases.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author braul
 */
public class ModeloResponsable {
    public ArrayList<Usuario> getResponsable() throws SQLException {
        Connection cn = Conexion.conectar();
        Statement stmt;
        ResultSet rs;
        ArrayList<Usuario> listaResp = new ArrayList<>();
        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery("select idTarea, responsable from tarea");
            while (rs.next()) {
                Usuario responsable = new Usuario();
                responsable.setId_responsable(rs.getInt("idtarea"));
                responsable.setNombre_responsable(rs.getString("responsable"));
                listaResp.add(responsable);
            }
        } catch (SQLException e) {

        }
        return listaResp;
    }
}
