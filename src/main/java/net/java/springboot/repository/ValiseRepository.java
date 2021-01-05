package net.java.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.java.springboot.model.Valise;

public interface ValiseRepository {

     List<Valise> findByNum(long numero);
    
     List<Valise> findByCritere(String critere);

}
