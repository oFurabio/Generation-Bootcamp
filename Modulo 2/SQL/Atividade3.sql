-- Criar o banco de dados
CREATE DATABASE Escola_DB;

-- Usar o banco de dados
USE Escola_DB;

-- Criar a tabela de estudantes
CREATE TABLE Estudantes (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(100),
    Idade INT,
    Turma VARCHAR(10),
    Nota DECIMAL(3, 1)
);

-- Inserir alguns registros
INSERT INTO Estudantes (Nome, Idade, Turma, Nota)
VALUES
    ('Maria Silva', 15, 'A', 8.5),
    ('Elias Moura', 14, 'B', 6.8),
    ('Flávio Farias', 16, 'A', 9.2),
    ('Raquel Barreto', 15, 'C', 7.3),
    ('Raphael Gomes', 14, 'B', 8.0),
    ('Jonas Ferreira', 16, 'A', 6.5),
    ('Ricardo Galvão', 15, 'C', 9.8),
    ('Gabriel de Assis', 14, 'B', 7.9);

-- Retorna todos os estudantes com nota maior do que 7.0
SELECT * FROM Estudantes WHERE Nota > 7.0;

-- Retorna todos os estudantes com nota menor do que 7.0
SELECT * FROM Estudantes WHERE Nota < 7.0;

-- Reabilita o modo de atualização segura
SET SQL_SAFE_UPDATES = 0;

-- Atualiza o salário do coitado
UPDATE Estudantes SET Nota = 9.0 WHERE Nome = 'Maria Silva';

-- Reabilita o modo de atualização segura
SET SQL_SAFE_UPDATES = 1;