package br.com.xavecoding.models;

import java.math.BigDecimal;

import org.hibernate.annotations.CollectionId;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//representa a tabela do professor no bacno

@Entity
public class Professor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	private BigDecimal salario;
	
	@Enumerated(EnumType.STRING)
	private StatusProfessor statusProfessor;
	
	
	public Professor() {
		super();
	}
	
	public Professor(String nome, BigDecimal salario, StatusProfessor statusProfessor) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.statusProfessor = statusProfessor;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public BigDecimal getSalario() {
		return salario;
	}


	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}


	public StatusProfessor getStatusProfessor() {
		return statusProfessor;
	}


	public void setStatusProfessor(StatusProfessor statusProfessor) {
		this.statusProfessor = statusProfessor;
	}
	
	
	
	

}
