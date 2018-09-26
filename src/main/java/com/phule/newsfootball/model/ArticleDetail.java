/**
 * 
 */
package com.phule.newsfootball.model;

/**
 * @author BH4Ljfe
 *
 */
public class ArticleDetail {

	private String id;
	private String ArticleId;
	private String img;
	private String title;
	private String description;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getArticleId() {
		return ArticleId;
	}
	public void setArticleId(String articleId) {
		ArticleId = articleId;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		String[] temps1 = img.split("\\?");
		String[] temps2 = temps1[0].split("/");
		this.img = ArticleId+"/"+temps2[5];
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
