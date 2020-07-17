package com.xworkz.springmvc.calamities.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="naturalcalamities")
public class NaturalCalamitiesDTO implements Serializable{

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="ID")
	private int id;
	@Column(name="PLACE")
	private String place;
	@Column(name="DATE")
	private String date;
	@Column(name="NAME")
	private String name;
	@Column(name="TYPES")
	private String types;
	@Column(name="AREA")
	private String area;
	@Column(name="LOSS")
	private String loss;
	@Column(name="DEATHS")
	private String deaths;
	@Column(name="INJURED")
	private String injured;
	
	public NaturalCalamitiesDTO() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLoss() {
		return loss;
	}
	public void setLoss(String loss) {
		this.loss = loss;
	}
	public String getDeaths() {
		return deaths;
	}
	public void setDeaths(String deaths) {
		this.deaths = deaths;
	}
	public String getInjured() {
		return injured;
	}
	public void setInjured(String injured) {
		this.injured = injured;
	}
	
	@Override
	public String toString() {
		return "NaturalCalamitiesDTO [place=" + place + ", date=" + date + ", name=" + name + ", types=" + types
				+ ", area=" + area + ", loss=" + loss + ", deaths=" + deaths + ", injured=" + injured + "]";
	}
	
}
