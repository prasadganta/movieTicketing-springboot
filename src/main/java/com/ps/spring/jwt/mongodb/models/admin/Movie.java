package com.ps.spring.jwt.mongodb.models.admin;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "movie")
public class Movie {

	@Id
	private String id;

	@NotBlank
	@Size(max = 100)
	private String title;
	@NotBlank
	private String duration;
	@NotBlank
	@Size(max = 20)
	private String language;
	@NotBlank
	private Date releaseDate;
	@NotBlank
	private String city;
	@NotBlank
	private String genre;

	private List<Show__1> show;

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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public List<Show__1> getShow() {
		return show;
	}

	public void setShow(List<Show__1> show) {
		this.show = show;
	}

}
