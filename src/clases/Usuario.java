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
public class Usuario {
    private int id_responsable;
    private String nombre_responsable;
    private String puesto;

    public Usuario() {
    }

    public Usuario(int id_responsable, String nombre_responsable) {
        this.id_responsable = id_responsable;
        this.nombre_responsable = nombre_responsable;
    }
    

    public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }

    public String getNombre_responsable() {
        return nombre_responsable;
    }

    public void setNombre_responsable(String nombre_responsable) {
        this.nombre_responsable = nombre_responsable;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public String toString() {
        return id_responsable + "-" + nombre_responsable;
    }
    
    
}
