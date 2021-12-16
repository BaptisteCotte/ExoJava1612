package fr.semifir.monBlog.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import fr.semifir.monBlog.entities.Utilisateur;

public interface UtilisateurRepository extends MongoRepository<Utilisateur, String>{

	//recherche par pseudo générée automatiquement
	Utilisateur findByPseudo(String pseudo);
}
