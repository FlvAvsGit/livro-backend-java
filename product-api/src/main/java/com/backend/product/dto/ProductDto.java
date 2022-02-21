package com.backend.product.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
	@NotBlank
	private String nome;
	@NotNull
	private Double price;
	@NotBlank
	private String description;
	@NotBlank
	private String productIdentifier;
	@NotNull
	private CategoryDto categoryDto;

	public ProductDto() {
	}
	public ProductDto(String nome, Double price, String description, String productIdentifier,
			CategoryDto categoryDto) {
		this.nome = nome;
		this.price = price;
		this.description = description;
		this.productIdentifier = productIdentifier;
		this.categoryDto = categoryDto;
	}

}
