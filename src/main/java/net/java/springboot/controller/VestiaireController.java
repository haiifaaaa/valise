package net.java.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.java.springboot.exception.RessourceNotFoundException;
import net.java.springboot.model.Vestiaire;
import net.java.springboot.repository.VestiaireRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/v1")


public class VestiaireController {
	
	@Autowired
	private VestiaireRepository vestiaireRepository ; 
	
	@GetMapping("/vestiaire")
	public List<Vestiaire> getAllVestiaire(){
		return vestiaireRepository.findAll();
		
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Vestiaire> getVestiaireById(@PathVariable(value = "id") Long vestiaireId)
			throws RessourceNotFoundException {
		Vestiaire vestiaire = vestiaireRepository.findById(vestiaireId).orElseThrow(() -> new RessourceNotFoundException("Vestiaire not found for this id :: " + vestiaireId));
		
		return ResponseEntity.ok().body(vestiaire);
	}

	@PostMapping("/employees")
	public Vestiaire createVestiaire(@Valid @RequestBody Vestiaire vestiaire) {
		return vestiaireRepository.save(vestiaire);
	}

	@PutMapping("/vestiaire/{id}")
	public ResponseEntity<Vestiaire> updateVestiaire(@PathVariable(value = "id") Long vestiaireId,
			@Valid @RequestBody Vestiaire vestiaireDetails) throws RessourceNotFoundException {
		Vestiaire vestiaire = vestiaireRepository.findById(vestiaireId)
				.orElseThrow(() -> new RessourceNotFoundException("Employee not found for this id :: " + vestiaireId));

		vestiaire.setNum(vestiaireDetails.getNum());
		vestiaire.setCode(vestiaireDetails.getCode());
		vestiaire.setNbarticle(vestiaireDetails.getNbarticle());
		final Vestiaire updatedVestiaire = vestiaireRepository.save(vestiaire);
		return ResponseEntity.ok(updatedVestiaire);
	}

	@DeleteMapping("/vestiaire/{id}")
	public Map<String, Boolean> deleteVestiaire(@PathVariable(value = "id") Long vestiaireId)
			throws RessourceNotFoundException {
		Vestiaire vestiaire = vestiaireRepository.findById(vestiaireId)
				.orElseThrow(() -> new RessourceNotFoundException("Vestiaire not found for this id :: " + vestiaireId));

		vestiaireRepository.delete(vestiaire);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	






}
	

