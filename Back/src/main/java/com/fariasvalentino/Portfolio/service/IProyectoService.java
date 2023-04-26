package com.fariasvalentino.Portfolio.service;

import com.fariasvalentino.Portfolio.model.Proyecto;
import java.util.Date;
import java.util.List;

public interface IProyectoService {

    public void crearProyecto(Proyecto proyecto);
    
    public void eliminarProyecto(Long id);
    
    public Proyecto editarProyecto(Long id, String nombre, String lenguaje, Date fechaInicio, Date fechaFin);
    
    public List <Proyecto> mostrarProyectos();
    
    public Proyecto buscarProyecto(Long id);
}
