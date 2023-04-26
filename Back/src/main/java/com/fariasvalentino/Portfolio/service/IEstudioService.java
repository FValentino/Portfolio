package com.fariasvalentino.Portfolio.service;

import com.fariasvalentino.Portfolio.model.Estudio;
import java.util.Date;
import java.util.List;

public interface IEstudioService {
    
    public void crearEstudio(Estudio estudio);
    
    public void eliminarEstudio(Long id);
    
    public Estudio editarEstudio(Long id, String titulo, String nombreCurso, String fechaInicio, String fechaFin);
    
    public List <Estudio> mostrarEstudios();
    
    public Estudio buscarEstudio(Long id);
}
