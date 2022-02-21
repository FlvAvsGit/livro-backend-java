package com.backend.product.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.backend.product.dto.CategoryDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;

	public Category() {
	}

	public Category(CategoryDto categoryDto) {
		this.id = categoryDto.getId();
		this.nome = categoryDto.getNome();
	}

	public static Category convert(CategoryDto categoryDto) {
		Category category = new Category();
		category.setId(categoryDto.getId());
		category.setNome(categoryDto.getNome());
		return category;
	}

}