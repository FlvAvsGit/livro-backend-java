package com.backend.product.dto;

import com.backend.product.entities.Category;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDto {
	private Long id;
	private String nome;

	public CategoryDto() {
	}

	public CategoryDto(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public static CategoryDto convert(Category category) {
		CategoryDto categoryDto = new CategoryDto();
		categoryDto.setId(category.getId());
		categoryDto.setNome(category.getNome());
		return categoryDto;
	}
}