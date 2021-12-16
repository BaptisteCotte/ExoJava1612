package fr.semifir.monBlog.services;

import fr.semifir.monBlog.entities.Article;
import fr.semifir.monBlog.repositories.ArticleRepository;
import java.util.List;

/**
 * Le service permet d'appliquer ma couche métier
 * Actuellement ma couche métier ne fais pas grd chose
 * Elle va juste communiquer avec une BDD
 */
public class ArticleService {
	
	ArticleRepository repository;

    /**
        Dans le constructeur
        Je mets des faux articles
     */
    public ArticleService(ArticleRepository repository) {
        this.repository = repository;
    }

    /**
     * On récupère une liste d'articles
     * @return List<Article>
     */
    public List<Article> findAll() {
        // Plus tards, cette méthode va nous permettre de communiquer
        // avec le REPOSITORY -> BDD
        return this.repository.findAll();
    }

    /**
     * On peu sauvegarder un article ou le mettre à jours
     * Ajouter à la liste "articles", un nouvel article
     * @param  article
     * @return Article
     */
    public Article save(Article article) {
        return this.repository.save(article);
    }
    
    /**
     * On peu supprimer un article
     * @param  article
     */
    public void delete(Article article) {
    	this.repository.delete(article);
    }
    
    //recherche par slug
    public Article findBySlug(String slug) {
    	return this.repository.findBySlug(slug);
    }
}
