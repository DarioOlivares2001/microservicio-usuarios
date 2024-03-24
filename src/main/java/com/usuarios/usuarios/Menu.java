package com.usuarios.usuarios;

public class Menu {
    private int Id;
    private String nombre;
    private String ruta;

    
    public Menu(int id, String nombre, String ruta) {
        Id = id;
        this.nombre = nombre;
        this.ruta = ruta;
    }
    
    public Menu() {
    }
    public int getId() {
        return Id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getRuta() {
        return ruta;
    }

    
}
