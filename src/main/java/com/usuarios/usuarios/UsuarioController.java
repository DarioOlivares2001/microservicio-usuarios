package com.usuarios.usuarios;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class UsuarioController {

    private List<Usuario> listauser = new ArrayList<>();

    public UsuarioController()
    {
        listauser.add(new Usuario(1, "aldo@gmail.com", "chamo", "123"));
        listauser.add(new Usuario(2, "pax@gmail.com", "paxter", "456"));
        listauser.add(new Usuario(3, "bill@gmail.com", "billie", "789"));
        listauser.add(new Usuario(4, "nix@gmail.com", "nixon", "741"));
        listauser.add(new Usuario(5, "wux@gmail.com", "wuxac", "369"));

    }

    
    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return listauser;
    }
    
}
