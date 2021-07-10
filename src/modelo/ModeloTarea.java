/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import clases.Conexion;
import clases.Tarea;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author braul
 */
public class ModeloTarea {
        public ArrayList<Tarea> getClientes() throws SQLException {
        Connection cn = Conexion.conectar();
        Statement stmt;
        ResultSet rs;
        ArrayList<Tarea> listaProyecto = new ArrayList<>();
        try {
            stmt = cn.createStatement();
            rs = stmt.executeQuery("select idtarea, nombreTarea from tarea");
            while (rs.next()) {
                Tarea responsable = new Tarea();
                responsable.setId_tarea(rs.getInt("idtarea"));
                responsable.setNombre_tarea(rs.getString("nombreTarea"));         
                listaProyecto.add(responsable);
            }
        } catch (SQLException e) {

        }
        return listaProyecto;
    }
}
