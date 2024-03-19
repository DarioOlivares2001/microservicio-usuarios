package com.usuarios.usuarios;

public class Usuario {

    private int id;
    private String email;
    private String usuario;
    private String password;

    public Usuario(int i, String e, String u, String p){
        this.id = i;
        this.email = e;
        this.usuario = u;
        this.password = p;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    
    
}
