/**
 * 
 */
package com.phule.newsfootball.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.phule.newsfootball.model.Article;
import com.phule.newsfootball.model.ArticleDetail;
import com.phule.newsfootball.model.Category;
import com.phule.newsfootball.repository.ArticleRepository;

/**
 * @author BH4Ljfe
 *
 */
@Repository
public class ArticeRepositoryImpl implements ArticleRepository{

	@Autowired
	private DataSource dataSource;
	
	public ArrayList<Article> getAllArticle() {
		String sql = "SELECT THREAD.*,CATEGORY.NAME FROM THREAD, CATEGORY WHERE THREAD.CATEGORYID = CATEGORY.ID";
		
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ArrayList<Article> articles = new ArrayList<Article>();
			while (rs.next()) {
				Article article = new Article();
				article.setId(rs.getString(1));
				article.setTitle(rs.getString(2));
				article.setThumbnail(rs.getString(3));
				article.setPublicDate(rs.getString(4));
				article.setDescription(rs.getString(5));
				Category category = new Category();
				category.setId(rs.getString(6));
				category.setName(rs.getString(8));
				article.setCategory(category);
				article.setHref(rs.getString(7));
				articles.add(article);
			}
			rs.close();
			ps.close();
			return articles;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	public Article getArticleByArticleId(String articleId) {
		String sql = "SELECT THREAD.*,CATEGORY.NAME FROM THREAD, CATEGORY WHERE THREAD.CATEGORYID = CATEGORY.ID AND THREAD.ID = '"+articleId+"'";
		
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ArrayList<Article> articles = new ArrayList<Article>();
			while (rs.next()) {
				Article article = new Article();
				article.setId(rs.getString(1));
				article.setTitle(rs.getString(2));
				article.setThumbnail(rs.getString(3));
				article.setPublicDate(rs.getString(4));
				article.setDescription(rs.getString(5));
				Category category = new Category();
				category.setId(rs.getString(6));
				category.setName(rs.getString(8));
				article.setCategory(category);
				article.setHref(rs.getString(7));
				articles.add(article);
			}
			rs.close();
			ps.close();
			return articles.get(0);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	public ArrayList<ArticleDetail> getArticleDetailByArticleId(String articleId) {
		String sql = "SELECT * FROM THREADDETAIL WHERE THREADID = '"+articleId+"'";
		
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ArrayList<ArticleDetail> links = new ArrayList<ArticleDetail>();
			while (rs.next()) {
				ArticleDetail articleDetail = new ArticleDetail();
				articleDetail.setId(rs.getString(1));
				articleDetail.setArticleId(rs.getString(2));
				articleDetail.setImg(rs.getString(3));
				links.add(articleDetail);
			}
			rs.close();
			ps.close();
			return links;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	public ArrayList<Article> getArticles(int numberOfArticle) {
		String sql = "SELECT THREAD.*,CATEGORY.NAME "
				+ "FROM THREAD, CATEGORY "
				+ "WHERE THREAD.CATEGORYID = CATEGORY.ID "
				+ "LIMIT "+numberOfArticle;
		
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ArrayList<Article> articles = new ArrayList<Article>();
			while (rs.next()) {
				Article article = new Article();
				article.setId(rs.getString(1));
				article.setTitle(rs.getString(2));
				article.setThumbnail(rs.getString(3));
				article.setPublicDate(rs.getString(4));
				article.setDescription(rs.getString(5));
				Category category = new Category();
				category.setId(rs.getString(6));
				category.setName(rs.getString(8));
				article.setCategory(category);
				article.setHref(rs.getString(7));
				articles.add(article);
			}
			rs.close();
			ps.close();
			return articles;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	public ArrayList<Article> getArticleByKeyword(String keyword) {
		String sql = "SELECT THREAD.*,CATEGORY.NAME "
				+ "FROM THREAD, CATEGORY "
				+ "WHERE THREAD.CATEGORYID = CATEGORY.ID "
				+ "AND LOWER(THREAD.TITLE) LIKE '%"+keyword.toLowerCase()+"%'";
		
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ArrayList<Article> articles = new ArrayList<Article>();
			while (rs.next()) {
				Article article = new Article();
				article.setId(rs.getString(1));
				article.setTitle(rs.getString(2));
				article.setThumbnail(rs.getString(3));
				article.setPublicDate(rs.getString(4));
				article.setDescription(rs.getString(5));
				Category category = new Category();
				category.setId(rs.getString(6));
				category.setName(rs.getString(8));
				article.setCategory(category);
				article.setHref(rs.getString(7));
				articles.add(article);
			}
			rs.close();
			ps.close();
			return articles;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	public ArrayList<Article> getArticlesByCategoryName(String categoryName) {
		String sql = "SELECT THREAD.*,CATEGORY.NAME "
				+ "FROM THREAD, CATEGORY "
				+ "WHERE THREAD.CATEGORYID = CATEGORY.ID "
				+ "AND LOWER(CATEGORY.NAME) = '"+categoryName.toLowerCase()+"'";
		
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ArrayList<Article> articles = new ArrayList<Article>();
			while (rs.next()) {
				Article article = new Article();
				article.setId(rs.getString(1));
				article.setTitle(rs.getString(2));
				article.setThumbnail(rs.getString(3));
				article.setPublicDate(rs.getString(4));
				article.setDescription(rs.getString(5));
				Category category = new Category();
				category.setId(rs.getString(6));
				category.setName(rs.getString(8));
				article.setCategory(category);
				article.setHref(rs.getString(7));
				articles.add(article);
			}
			rs.close();
			ps.close();
			return articles;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

}
