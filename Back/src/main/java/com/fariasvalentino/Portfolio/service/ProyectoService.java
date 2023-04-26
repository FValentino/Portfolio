package com.fariasvalentino.Portfolio.service;

import com.fariasvalentino.Portfolio.model.Proyecto;
import com.fariasvalentino.Portfolio.repository.IProyectoRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    IProyectoRepository proyectoRepo;

    @Override
    public void crearProyecto(Proyecto proyecto) {
        this.proyectoRepo.save(proyecto);
    }

    @Override
    public void eliminarProyecto(Long id) {
        this.proyectoRepo.deleteById(id);
    }

    @Override
    public Proyecto editarProyecto(Long id, String nombre, String lenguaje, Date fechaInicio, Date fechaFin) {
        
        Proyecto proyecto = this.proyectoRepo.findById(id).orElse(null);
        
        proyecto.setNombre(nombre);
        proyecto.setLenguaje(lenguaje);
        proyecto.setFechaInicio(fechaInicio);
        proyecto.setFechaFin(fechaFin);
        
        this.proyectoRepo.save(proyecto);
        
        return proyecto;
    }

    @Override
    public List<Proyecto> mostrarProyectos() {
        return this.proyectoRepo.findAll();
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return this.proyectoRepo.findById(id).orElse(null);
    }
    
    
}
