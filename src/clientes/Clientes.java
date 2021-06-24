/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ricas
 */
public class Clientes {

    int id;
    String nombre;
    String telefono;
    int edad;
    String correo;

    public Clientes(int id, String nombre, String telefono, int edad, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.correo = correo;
    }

    Clientes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    static void setModel(DefaultTableModel modelo) {
    }
    
}
