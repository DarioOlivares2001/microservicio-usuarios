package com.usuarios.usuarios;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class UsuarioController {

    private List<Usuario> listauser = new ArrayList<>();

    public UsuarioController()
    {

        listauser.add(new Usuario(2,"paxter pax", "pax@gmail.com", "paxter", "456",
            Arrays.asList(new Rol(1, "Vendedor", "Ventas", Arrays.asList(new Menu(3, "Ordenes de Venta", "/ordenventa"),
                                                                                            new Menu(4, "Reporte Venta", "/reporteventa"))))));

        listauser.add(new Usuario(3,"bill bixby", "bill@gmail.com", "billie", "789",
            Arrays.asList(new Rol(1, "Bodeguero", "Bodega", Arrays.asList(new Menu(5, "Inventario", "/inventario"))))));

        listauser.add(new Usuario(4,"nix nixbiry", "nix@gmail.com", "nixon", "741",
            Arrays.asList(new Rol(1, "Comex", "Comercio Exterior", Arrays.asList(new Menu(6, "Comercio Exterior", "/comex"))))));

        listauser.add(new Usuario(5, "wux wuxante","wux@gmail.com", "wuxac", "369",
            Arrays.asList(new Rol(1, "Cajero", "Caja", Arrays.asList(new Menu(7, "Caja", "/caja"))))));


        listauser.add(new Usuario(1,"aldo crespo", "aldo@gmail.com", "chamo", "123", 
            Arrays.asList(new Rol(1, "Administrador", "Accede a todo", Arrays.asList(  new Menu(1, "Usuarios", "/usuarios"),
                                                                                                        new Menu(2, "Perfiles", "/perfiles"),
                                                                                                        new Menu(3, "Ordenes de Venta", "/ordenventa"),
                                                                                                        new Menu(4, "Reporte Venta", "/reporteventa"),
                                                                                                        new Menu(6, "Comercio Exterior", "/comex"),
                                                                                                        new Menu(6, "Comercio Exterior", "/comex"),
                                                                                                        new Menu(7, "Caja", "/caja")           )))));            

    }

    
    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return listauser;
    }

    @GetMapping("/usuarios/{id}")
    public ResponseEntity<?> getUsuarioById(@PathVariable int id) {

         for(Usuario p : listauser){
            if(p.getId() == id)
            {
                return ResponseEntity.ok(p) ;
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontro el usuario con el id " + id);
    }


    @GetMapping("/usuarios/menuxrol")
    public List<Rol> getMenuByRol() {
        List<Rol> listaroles = new ArrayList<>();
        for(Usuario p : listauser){
            for(Rol r : p.getRoles())
            {
                listaroles.add(r);
            }
        }

        return listaroles;
    }
    

    
    
}
