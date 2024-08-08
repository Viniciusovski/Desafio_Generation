package com.generation.desafio.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_alunos")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String nome;

	private String idade;
	
	private int notaPrimeiroSemestre;

	private  int notaSegundoSemestre;

	private String nomeProfessor;

	private String numeroSala;

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(String numeroSala) {
		this.numeroSala = numeroSala;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade (String idade) {
		this.idade = idade;
	}

	public int getNotaPrimeiroSemestre() {
		return notaPrimeiroSemestre;
	}

	public void setNotaPrimeiroSemestre(int notaPrimeiroSemestre) {
		this.notaPrimeiroSemestre = notaPrimeiroSemestre;
	}

	public int getNotaSegundoSemestre() {
		return notaSegundoSemestre;
	}

	public void setNotaSegundoSemestre(int notaSegundoSemestre) {
		this.notaSegundoSemestre = notaSegundoSemestre;
	}
}
