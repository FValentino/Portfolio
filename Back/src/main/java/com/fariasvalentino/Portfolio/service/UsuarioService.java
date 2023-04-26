package com.fariasvalentino.Portfolio.service;

import com.fariasvalentino.Portfolio.model.Usuario;
import com.fariasvalentino.Portfolio.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    IUsuarioRepository usuarioRepo;
    
    @Override
    public void saveUsuario(Usuario usuario) {
        this.usuarioRepo.save(usuario);
    }

    @Override
    public void deleteUsuario(Long id) {
        this.usuarioRepo.deleteById(id);
    }

    @Override
    public Usuario putUsuario(Long id, String nombre, String apellido, String clave, String ocupacion, 
                                String email, String telefono, String localizacion) {
       
        Usuario usuario = this.usuarioRepo.findById(id).orElse(null);
        
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setClave(clave);
        usuario.setOcupacion(ocupacion);
        usuario.setEmail(email);
        usuario.setTelefono(telefono);
        usuario.setLocalizacion(localizacion);
        
        return usuario;
    }

    @Override
    public Usuario findByEmail(String email){
        return this.usuarioRepo.findByEmail(email);
    }
}
