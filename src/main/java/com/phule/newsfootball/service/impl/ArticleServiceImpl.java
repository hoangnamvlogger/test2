/**
 * 
 */
package com.phule.newsfootball.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phule.newsfootball.model.Article;
import com.phule.newsfootball.model.ArticleDetail;
import com.phule.newsfootball.repository.ArticleRepository;
import com.phule.newsfootball.service.ArticleService;

/**
 * @author BH4Ljfe
 *
 */
@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	ArticleRepository articleRepository;

	public ArrayList<Article> getAllArticle() {
		// TODO Auto-generated method stub
		return articleRepository.getAllArticle();
	}

	public Article getArticleByArticleId(String ArticleId) {
		return articleRepository.getArticleByArticleId(ArticleId);
	}

	public ArrayList<ArticleDetail> getArticleDetailByArticleId(String ArticleId) {
		return articleRepository.getArticleDetailByArticleId(ArticleId);
	}

	public ArrayList<Article> getArticles(int numberOfArticle) {
		return articleRepository.getArticles(numberOfArticle);
	}

	public ArrayList<Article> getArticleByKeyword(String keyword) {
		return articleRepository.getArticleByKeyword(keyword);
	}


	public ArrayList<Article> getArticlesByCategoryName(String categoryName) {
		// TODO Auto-generated method stub
		return articleRepository.getArticlesByCategoryName(categoryName);
	}

}
