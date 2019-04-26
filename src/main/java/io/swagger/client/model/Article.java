/*
 * Hytale API
 * Hytale Official API
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CoverImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Article
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-26T16:07:33.554Z")
public class Article {
  @SerializedName("featured")
  private Boolean featured = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("_id")
  private String id = null;

  @SerializedName("author")
  private String author = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("publishedAt")
  private String publishedAt = null;

  @SerializedName("coverImage")
  private CoverImage coverImage = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("publishedTo")
  private List<String> publishedTo = null;

  @SerializedName("bodyExcerpt")
  private String bodyExcerpt = null;

  @SerializedName("body")
  private String body = null;

  public Article featured(Boolean featured) {
    this.featured = featured;
    return this;
  }

   /**
   * Get featured
   * @return featured
  **/
  @ApiModelProperty(value = "")
  public Boolean isFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  public Article tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Article addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Article id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Article author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(value = "")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Article title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Article publishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

   /**
   * Get publishedAt
   * @return publishedAt
  **/
  @ApiModelProperty(value = "")
  public String getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
  }

  public Article coverImage(CoverImage coverImage) {
    this.coverImage = coverImage;
    return this;
  }

   /**
   * Get coverImage
   * @return coverImage
  **/
  @ApiModelProperty(value = "")
  public CoverImage getCoverImage() {
    return coverImage;
  }

  public void setCoverImage(CoverImage coverImage) {
    this.coverImage = coverImage;
  }

  public Article createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Article slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @ApiModelProperty(value = "")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Article publishedTo(List<String> publishedTo) {
    this.publishedTo = publishedTo;
    return this;
  }

  public Article addPublishedToItem(String publishedToItem) {
    if (this.publishedTo == null) {
      this.publishedTo = new ArrayList<String>();
    }
    this.publishedTo.add(publishedToItem);
    return this;
  }

   /**
   * Get publishedTo
   * @return publishedTo
  **/
  @ApiModelProperty(value = "")
  public List<String> getPublishedTo() {
    return publishedTo;
  }

  public void setPublishedTo(List<String> publishedTo) {
    this.publishedTo = publishedTo;
  }

  public Article bodyExcerpt(String bodyExcerpt) {
    this.bodyExcerpt = bodyExcerpt;
    return this;
  }

   /**
   * Get bodyExcerpt
   * @return bodyExcerpt
  **/
  @ApiModelProperty(value = "")
  public String getBodyExcerpt() {
    return bodyExcerpt;
  }

  public void setBodyExcerpt(String bodyExcerpt) {
    this.bodyExcerpt = bodyExcerpt;
  }

  public Article body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Article article = (Article) o;
    return Objects.equals(this.featured, article.featured) &&
        Objects.equals(this.tags, article.tags) &&
        Objects.equals(this.id, article.id) &&
        Objects.equals(this.author, article.author) &&
        Objects.equals(this.title, article.title) &&
        Objects.equals(this.publishedAt, article.publishedAt) &&
        Objects.equals(this.coverImage, article.coverImage) &&
        Objects.equals(this.createdAt, article.createdAt) &&
        Objects.equals(this.slug, article.slug) &&
        Objects.equals(this.publishedTo, article.publishedTo) &&
        Objects.equals(this.bodyExcerpt, article.bodyExcerpt) &&
        Objects.equals(this.body, article.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featured, tags, id, author, title, publishedAt, coverImage, createdAt, slug, publishedTo, bodyExcerpt, body);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Article {\n");
    
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    coverImage: ").append(toIndentedString(coverImage)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    publishedTo: ").append(toIndentedString(publishedTo)).append("\n");
    sb.append("    bodyExcerpt: ").append(toIndentedString(bodyExcerpt)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

