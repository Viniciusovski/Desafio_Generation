package desafio.generation.api.aluno;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAluno(
   @NotBlank
   String nome,

   String idade,
   double nota_do_primeiro_semestre,
   double nota_do_segundo_semestre,

   @NotNull
   String nome_do_professor,

   @NotNull
   int numero_da_sala
) {
}
