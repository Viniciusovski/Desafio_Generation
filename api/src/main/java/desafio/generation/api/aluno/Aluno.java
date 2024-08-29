package desafio.generation.api.aluno;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

@Table(name = "alunos")
@Entity(name = "Aluno")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String idade;
    private double nota_do_primeiro_semestre;
    private double nota_do_segundo_semestre;
    private String nome_do_professor;
    private int numero_da_sala;

    public Aluno(@Valid DadosAluno dados) {
        this.nome = dados.nome();
        this.idade = dados.idade();
        this.nota_do_primeiro_semestre = dados.nota_do_primeiro_semestre();
        this.nota_do_segundo_semestre = dados.nota_do_segundo_semestre();
        this.nome_do_professor = dados.nome_do_professor();
        this.numero_da_sala = dados.numero_da_sala();
    }

    public void atualizarInformacoes(@Valid DadosAtualizacaoAluno dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.idade() != null){
            this.idade = dados.idade();
        }
        if(Double.isNaN(dados.nota_do_primeiro_semestre()) || dados.nota_do_primeiro_semestre() > 0.0){
            this.nota_do_primeiro_semestre = dados.nota_do_primeiro_semestre();
        }
        if(Double.isNaN(dados.nota_do_segundo_semestre()) || dados.nota_do_segundo_semestre() > 0.0){
            this.nota_do_segundo_semestre = dados.nota_do_segundo_semestre();
        }
        if(dados.nome_do_professor() != null){
            this.nome_do_professor = dados.nome_do_professor();
        }
        if(dados.numero_da_sala() > 0){
            this.numero_da_sala = dados.numero_da_sala();
        }
    }
}
