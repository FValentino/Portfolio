package com.fariasvalentino.Portfolio.controller;

import com.fariasvalentino.Portfolio.model.*;
import com.fariasvalentino.Portfolio.service.*;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class PortfolioController {
    
    @Autowired
    private IUsuarioService usuarios;
    @Autowired
    private IEstudioService estudios;
    @Autowired
    private IProyectoService proyectos;
    
    
    //Controller usuario
    @PostMapping ("/portfolio/usuario/registrar")
    public String crearUsuario(@RequestBody Usuario usuario){
        
        usuarios.saveUsuario(usuario);
        
        return "Usuario cargado";
    }
    
    @PostMapping ("/portfolio/iniciar-sesion")
    public Usuario buscarUsuario(@RequestBody Usuario usuario){
        return this.usuarios.findByEmail(usuario.getEmail());
    }
    
    @DeleteMapping 
    public String eliminarUsuario(Long id){
        
        usuarios.deleteUsuario(id);
        
        return "Usuario eliminado";
    }
    
    @PutMapping ("/portfolio/usuario/editar")
    public Usuario editarUsuario(Long id, String nombre, String apellido, String clave, String ocupacion, 
                                String email, String telefono, String localizacion) {
        return usuarios.putUsuario(id, nombre, apellido, clave, ocupacion, email, telefono, localizacion);
    }
 
}
