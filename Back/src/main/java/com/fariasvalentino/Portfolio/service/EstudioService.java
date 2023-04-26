package com.fariasvalentino.Portfolio.service;

import com.fariasvalentino.Portfolio.model.Estudio;
import com.fariasvalentino.Portfolio.repository.IEstudioRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioService implements IEstudioService{

    @Autowired
    IEstudioRepository estudioRepo;
    
    
    //Estudio service
    @Override
    public void crearEstudio(Estudio estudio) {
        this.estudioRepo.save(estudio);
    }

    @Override
    public void eliminarEstudio(Long id) {
        this.estudioRepo.deleteById(id);
    }

    @Override
    public Estudio editarEstudio(Long id, String titulo, String nombreCurso, String fechaInicio, String fechaFin) {
        
        Estudio estudio = this.buscarEstudio(id);
        
        estudio.setNombreCurso(nombreCurso);
        estudio.setTitulo(titulo);
        estudio.setFechaInicio(fechaInicio);
        estudio.setFechaFin(fechaFin);
        
        this.estudioRepo.save(estudio);
        
        return estudio;
    }

    @Override
    public List<Estudio> mostrarEstudios() {
        return this.estudioRepo.findAll();
    }
    
    @Override
    public Estudio buscarEstudio(Long id) {
        return this.estudioRepo.findById(id).orElse(null);
    }
    
}
