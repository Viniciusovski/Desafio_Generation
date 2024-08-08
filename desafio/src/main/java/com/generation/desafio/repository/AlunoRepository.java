package com.generation.desafio.repository;

import java.util.List;

import com.generation.desafio.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	//Fazer pesquisa no banco pelo nome
	public List<Aluno> findAllByNomeContainingIgnoreCase(String nome);
}
