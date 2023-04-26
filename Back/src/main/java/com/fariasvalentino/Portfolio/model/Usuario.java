package com.fariasvalentino.Portfolio.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private String clave;
    private String ocupacion;
    private String email;
    private String telefono;
    private String localizacion;

    public Usuario(Long id, String nombre, String apellido, String clave, String ocupacion, 
            String email, String telefono, String localizacion) {
        
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.ocupacion = ocupacion;
        this.email = email;
        this.telefono = telefono;
        this.localizacion = localizacion;
    }

    public Usuario() {
    }
    
}
