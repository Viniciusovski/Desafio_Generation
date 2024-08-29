CREATE TABLE alunos (
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INT CHECK (idade >= 5 AND idade <= 100),
    nota_do_primeiro_semestre DECIMAL(4, 2) CHECK (nota_do_primeiro_semestre >= 0 AND nota_do_primeiro_semestre <= 10),
    nota_do_segundo_semestre DECIMAL(4, 2) CHECK (nota_do_segundo_semestre >= 0 AND nota_do_segundo_semestre <= 10),
    nome_do_professor VARCHAR(100) NOT NULL,
    numero_da_sala INT NOT NULL
);
