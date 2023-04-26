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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String lenguaje;
    private Date fechaInicio;
    private Date fechaFin;

    public Proyecto(Long id, String nombre, String lenguaje, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.nombre = nombre;
        this.lenguaje = lenguaje;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    
    
    public Proyecto(){
        
    }
}
