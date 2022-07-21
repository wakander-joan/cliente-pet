package br.com.petz.clientepet.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.petz.clientepet.cliente.application.api.ClienteRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)

	
	private UUID idCliente;
	
	@NotBlank
	private String nomeCompleto;
	@Email
	@NotBlank
	private String email;
	@NotBlank
	private String celular;
	private String telefone;
	private Sexo sexo;
	@NotNull
	private LocalDate dataNacimento;
	@CPF
	private String cpf;
	@NotNull
	private Boolean aceitaTermos;
	
	private LocalDateTime datahoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Cliente(ClienteRequest clienteRequest) {
	
		this.idCliente = UUID.randomUUID();
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.email = clienteRequest.getEmail();
		this.celular = clienteRequest.getCelular();
		this.telefone = clienteRequest.getTelefone();
		this.sexo = clienteRequest.getSexo();
		this.dataNacimento = clienteRequest.getDataNacimento();
		this.cpf = clienteRequest.getCpf();
		this.aceitaTermos = clienteRequest.getAceitaTermos();
		this.datahoraDoCadastro = LocalDateTime.now();
	}
	
	
}
