package com.fariasvalentino.Portfolio.repository;

import com.fariasvalentino.Portfolio.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudioRepository extends JpaRepository <Estudio, Long>{
  
}
