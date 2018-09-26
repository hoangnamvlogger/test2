/**
 * 
 */
package com.phule.newsfootball.model;

import java.util.ArrayList;

/**
 * @author BH4Ljfe
 *
 */
public class Article {

	private String id;
	private String title;
	private String thumbnail;
	private String publicDate;
	private String description;
	private Category category = new Category();
	private String href;
	private ArrayList<ArticleDetail> links = new ArrayList<ArticleDetail>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		String[] temps2 = thumbnail.split("/");
		this.thumbnail = id+"/"+temps2[5];
	}
	public String getPublicDate() {
		return publicDate;
	}
	public void setPublicDate(String publicDate) {
		this.publicDate = publicDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		String[] hrefs = href.split("/");
		this.href = "category/"+category.getName().toLowerCase()+"/"+id+"/"+hrefs[6];
	}
	public ArrayList<ArticleDetail> getLinks() {
		return links;
	}
	public void setLinks(ArrayList<ArticleDetail> links) {
		this.links = links;
	}
	
	
}
