/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author darkm
 */
public class Puntuacion implements Serializable{
    private int puntos;
    private String nombre,fecha;

    public Puntuacion(int puntos, String nombre, String fecha) {
        this.puntos = puntos;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public String toString() {
        return "Puntuacion{" + "puntos=" + puntos + ", nombre=" + nombre + ", fecha=" + fecha + '}';
    }
}
