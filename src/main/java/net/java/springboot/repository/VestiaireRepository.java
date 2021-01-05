package net.java.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.java.springboot.model.Vestiaire;

public interface VestiaireRepository extends JpaRepository<Vestiaire, Long> {

	 List<Vestiaire> findByPublished(boolean published);

	 List<Vestiaire> findByTitleContaining(String num);
	
}
