/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import clases.Conexion;
import clases.ModeloProyecto;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author braul
 */
public class ModProyecto {

    public ArrayList<ModeloProyecto> getClientes() throws SQLException {
        Connection cn = Conexion.conectar();
        Statement stmt;
        ResultSet rs;
        ArrayList<ModeloProyecto> listaProyecto = new ArrayList<>();
        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery("select id_proyecto, nombre_proyecto from proyecto");
            while (rs.next()) {
                ModeloProyecto proy = new ModeloProyecto();
                proy.setId_proyecto(rs.getInt("id_proyecto"));
                proy.setNombre_proyecto(rs.getString("nombre_proyecto"));
                listaProyecto.add(proy);
            }
        } catch (SQLException e) {

        }
        return listaProyecto;
    }
}
