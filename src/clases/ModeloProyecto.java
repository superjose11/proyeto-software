/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author braul
 */
public class ModeloProyecto {
    private int id_proyecto;
    private String nombre_proyecto;
    
    public ModeloProyecto(){
        
    }
    
    public ModeloProyecto(int id_proyecto, String nombre_proyecto){
        this.id_proyecto=id_proyecto;
        this.nombre_proyecto=nombre_proyecto;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }
    
    @Override
    public String toString(){
        return id_proyecto + "-" + nombre_proyecto;
    }
}
