package desafio.generation.api.aluno;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoAluno(
        @NotNull
        Long id,
        String nome,

        String idade,
        double nota_do_primeiro_semestre,
        double nota_do_segundo_semestre,
        String nome_do_professor,
        int numero_da_sala
) {
}
