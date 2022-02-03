package com.mobdev.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Origin implements Serializable {

	private String name;
	private String url;
	private String dimension;
	@Column(name = "arguments")
	@ElementCollection(targetClass = String.class)
	private List<String> residents;

	/**
	 * @return the residents
	 */
	public List<String> getResidents() {
		return residents;
	}

	/**
	 * @param residents the residents to set
	 */
	public void setResidents(List<String> residents) {
		this.residents = residents;
	}

	/**
	 * @return the dimension
	 */
	public String getDimension() {
		return dimension;
	}

	/**
	 * @param dimension the dimension to set
	 */
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
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

	public Origin() {
	}

	@Override
	public String toString() {
		String residentes = "";
		for (int i = 0; i < residents.size(); i++)
			residentes = residentes + residents.get(i) + "\n";

		return "Origin{" + ", name='" + name + '\'' + ", url='" + url + '\'' + ", dimension='" + dimension + '\''
				+ residentes + '}';
	}
}