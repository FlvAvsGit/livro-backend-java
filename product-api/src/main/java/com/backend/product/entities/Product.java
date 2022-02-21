package com.backend.product.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Double price;
	private String description;
	private String productIdentifier;
	
	@OneToMany
	@JoinColumn(name = "category_id")
	private Category category;

	public Product() {
	}

	public Product(Long id, String nome, Double price, String description, String productIdentifier) {
		this.id = id;
		this.nome = nome;
		this.price = price;
		this.description = description;
		this.productIdentifier = productIdentifier;
	}

}
