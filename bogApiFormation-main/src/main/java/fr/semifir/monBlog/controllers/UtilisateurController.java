package fr.semifir.monBlog.controllers;

import fr.semifir.monBlog.entities.Utilisateur;
import fr.semifir.monBlog.services.UtilisateurService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("utilisateurs")
public class UtilisateurController {

	UtilisateurService service;
	
	public UtilisateurController(UtilisateurService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Utilisateur> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping("{pseudo}")
	public Utilisateur findByPseudo(@PathVariable String pseudo) {
		return this.service.findByPseudo(pseudo);
	}
	
	@PostMapping
	public Utilisateur save(Utilisateur utilisateur) {
		return this.service.save(utilisateur);
	}
	
	@PutMapping
	public Utilisateur update(@RequestBody Utilisateur utilisateur) {
		return this.service.save(utilisateur);
	}
	
	@DeleteMapping
	public void delete(@RequestBody Utilisateur utilisateur) {
		this.service.delete(utilisateur);
	}
}
