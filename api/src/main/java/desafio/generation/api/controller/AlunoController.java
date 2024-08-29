package desafio.generation.api.controller;

import desafio.generation.api.aluno.Aluno;
import desafio.generation.api.aluno.AlunoRepository;
import desafio.generation.api.aluno.DadosAluno;
import desafio.generation.api.aluno.DadosAtualizacaoAluno;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@CrossOrigin(origins = "*")
public class AlunoController {

    @Autowired
    AlunoRepository repository;

    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid DadosAluno dados){
        repository.save(new Aluno(dados));
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid DadosAtualizacaoAluno dados){
        var aluno = repository.getReferenceById(dados.id());
        aluno.atualizarInformacoes(dados);
    }

    @GetMapping
    public List<Aluno> read(){
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }

}