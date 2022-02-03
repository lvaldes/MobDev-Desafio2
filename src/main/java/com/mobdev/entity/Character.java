package com.mobdev.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Character implements Serializable {

	public Character() {

	}

	private int id;
	private String name;
	private String status;
	private String species;
	private String type;

	@Column(name = "arguments")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@ElementCollection(targetClass = String.class)
	private List<String> episode;

	private int episode_count;

	private Origin origin;

	/**
	 * @return the origin
	 */
	public Origin getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(Origin origin) {
		this.origin = origin;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the episode
	 */

	public List<String> getEpisode() {
		return episode;
	}

	/**
	 * @param episode the episode to set
	 */
	public void setEpisode(List<String> episode) {
		this.episode = episode;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the species
	 */
	@JsonIgnore
	public String getSpecies() {
		return species;
	}

	/**
	 * @param species the species to set
	 */

	public void setSpecies(String species) {
		this.species = species;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Character{" + "id = " + id + " name = " + name + " status = " + status + " type = " + type
				+ " episode_count = " + 5 + " origin_name = " + origin.getName() + " origin_url = " + origin.getUrl() +

				'}';
	}

	public int getEpisode_count() {
		return episode_count;
	}

	public void setEpisode_count(int episode_count) {
		this.episode_count = episode_count;
	}

}
