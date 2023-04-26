package com.fariasvalentino.Portfolio.service;

import com.fariasvalentino.Portfolio.model.Usuario;

public interface IUsuarioService {

    public void saveUsuario(Usuario usuario);
    
    public void deleteUsuario(Long id);
    
    public Usuario putUsuario(Long id, String nombre, String apellido, String clave, String ocupacion,
                                 String email, String telefono, String localizacion);
    
    public Usuario findByEmail(String email);
}
