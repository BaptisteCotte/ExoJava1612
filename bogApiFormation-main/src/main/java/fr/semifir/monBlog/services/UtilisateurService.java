package fr.semifir.monBlog.services;

import fr.semifir.monBlog.entities.Utilisateur;
import fr.semifir.monBlog.repositories.UtilisateurRepository;
import java.util.List;

public class UtilisateurService {

	UtilisateurRepository repository;
	
	public UtilisateurService(UtilisateurRepository repository) {
        this.repository = repository;
    }
	
	//retourne tout les utilisateurs
	public List<Utilisateur> findAll(){
		return this.repository.findAll();
	}
	
	//ajout ou update d'un utilisateur
	public Utilisateur save(Utilisateur utilisateur) {
		return this.repository.save(utilisateur);
	}
	
	//suppression d'un utilisateur
	public void delete(Utilisateur utilisateur) {
		this.delete(utilisateur);
	}
	
	//recherche d'un utilisateur par pseudo
	public Utilisateur findByPseudo(String pseudo) {
		return this.repository.findByPseudo(pseudo);
	}
	
}
