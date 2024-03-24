package com.usuarios.usuarios;

import java.util.List;

public class Usuario {

    private int id;
    private String nombre;
    private String email;
    private String user;
    private String password;
    private List<Rol> roles;

   

    public Usuario(int id, String nombre, String email, String user, String password, List<Rol> roles){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.user = user;
        this.password = password;
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }  

    public List<Rol> getRoles() {
        return roles;
    }
    
}
