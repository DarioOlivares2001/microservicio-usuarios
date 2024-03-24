package com.usuarios.usuarios;

import java.util.List;

public class Rol {
    private int id;
    private String rol;
    private String descripcion;
    private List<Menu> opciones;


    
    public Rol(int id, String rol, String descripcion, List<Menu> opciones) {
        this.id = id;
        this.rol = rol;
        this.descripcion = descripcion;
        this.opciones = opciones;
    }

    public int getId() {
        return id;
    }
    public String getRol() {
        return rol;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public List<Menu> getOpciones() {
        return opciones;
    }


    
    
}
