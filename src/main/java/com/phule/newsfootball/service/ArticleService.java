package com.phule.newsfootball.service;

import java.util.ArrayList;

import com.phule.newsfootball.model.Article;
import com.phule.newsfootball.model.ArticleDetail;

public interface ArticleService {

	ArrayList<Article> getAllArticle();
	public Article getArticleByArticleId(String ArticleId);
	public ArrayList<ArticleDetail> getArticleDetailByArticleId(String ArticleId);
	public ArrayList<Article> getArticles(int numberOfArticle);
	public ArrayList<Article> getArticleByKeyword(String keyword);
	public ArrayList<Article> getArticlesByCategoryName(String categoryName);
}
