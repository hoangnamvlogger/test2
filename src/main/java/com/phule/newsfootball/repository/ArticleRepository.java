/**
 * 
 */
package com.phule.newsfootball.repository;

import java.util.ArrayList;

import com.phule.newsfootball.model.Article;
import com.phule.newsfootball.model.ArticleDetail;

/**
 * @author BH4Ljfe
 *
 */
public interface ArticleRepository {

	public ArrayList<Article> getAllArticle();
	public Article getArticleByArticleId(String ArticleId);
	public ArrayList<ArticleDetail> getArticleDetailByArticleId(String ArticleId);
	public ArrayList<Article> getArticles(int numberOfArticle);
	public ArrayList<Article> getArticleByKeyword(String keyword);
	public ArrayList<Article> getArticlesByCategoryName(String categoryName);
}
