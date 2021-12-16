package fr.semifir.monBlog.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class Utilisateur {
	@Id
	private String id;
    private String nom;
    private String prenom;
    @Indexed(unique = true)
    private String email;
    @Indexed(unique = true)
    private String pseudo;
}
