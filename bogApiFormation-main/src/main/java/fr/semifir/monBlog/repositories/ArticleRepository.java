package fr.semifir.monBlog.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import fr.semifir.monBlog.entities.Article;

public interface ArticleRepository extends MongoRepository<Article, String> {

	//recherche par slug générée automatiquement
	Article findBySlug(String slug);
}
