
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
public class Estudio {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombreCurso;
    private String titulo;
    private String fechaInicio;
    private String fechaFin;

    public Estudio(Long id, String titulo, String nombreCurso, String fechaInicio, String fechaFin) {
        this.id = id;
        this.nombreCurso = nombreCurso;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    public Estudio(){
        
    }
}
