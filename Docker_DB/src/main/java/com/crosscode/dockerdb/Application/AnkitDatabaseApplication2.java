package com.crosscode.dockerdb.Application;

import javax.persistence.*;
@Entity
@Table(name="users")
public class AnkitDatabaseApplication2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="city")
	private String city;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public AnkitDatabaseApplication2(Integer id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public AnkitDatabaseApplication2() {
		super();
	}
	
	
	
}
