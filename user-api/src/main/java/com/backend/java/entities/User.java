package com.backend.java.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.backend.java.dto.UserDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	private String telefone;
	private Date dataCadastro;

	public User(UserDto userDto) {
		this.setNome(userDto.getNome());
		this.setCpf(userDto.getCpf());
		this.setEndereco(userDto.getEndereco());
		this.setEmail(userDto.getEmail());
		this.setTelefone(userDto.getTelefone());
		this.setDataCadastro(userDto.getDataCadastro());
	}

	public User() {
	}
}
