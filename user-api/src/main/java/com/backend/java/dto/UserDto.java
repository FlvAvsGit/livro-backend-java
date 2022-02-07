package com.backend.java.dto;

import java.util.Date;

import com.backend.java.entities.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	private Long id;
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	private String telefone;
	private Date dataCadastro;

	public UserDto(User user) {
		this.id = user.getId();
		this.nome = user.getNome();
		this.endereco = user.getEndereco();
		this.email = user.getEmail();
		this.telefone = user.getTelefone();
		this.dataCadastro = user.getDataCadastro();
	}
	
	public static UserDto convert (User user) {
		UserDto userDto = new UserDto();
		userDto.setNome(user.getNome());
		userDto.setCpf(user.getCpf());
		userDto.setEndereco(user.getEndereco());
		userDto.setEmail(user.getEmail());
		userDto.setTelefone(user.getTelefone());
		userDto.setDataCadastro(user.getDataCadastro());
			return userDto;
			}

}
