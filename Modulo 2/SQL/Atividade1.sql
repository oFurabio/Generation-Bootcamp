-- Criar o banco de dados
CREATE DATABASE RH_DB;

-- Usar o banco de dados
USE RH_DB;

-- Criar a tabela de colaboradores
CREATE TABLE Colaboradores (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(100) not null,
    Cargo VARCHAR(50) not null,
    Salario DECIMAL(10, 2) not null,
    Departamento VARCHAR(50) not null,
    DataContratacao DATE not null
);

-- Inserir alguns registros
INSERT INTO Colaboradores (Nome, Cargo, Salario, Departamento, DataContratacao)
VALUES
    ('João Silva', 'Analista de RH', 2500.00, 'Recursos Humanos', '2020-07-22'),
    ('Maria Oliveira', 'Desenvolvedor', 3000.00, 'TI', '2020-02-29'),
    ('Carlos Santos', 'Analista Financeiro', 1800.00, 'Financeiro', '2018-09-01'),
    ('Ana Pereira', 'Assistente Administrativo', 5200.00, 'Administração', '2014-05-13'),
    ('Pedro Sousa', 'Gerente de Projetos', 3500.00, 'TI', '2021-05-05');
    
    -- Retorna todos os colaboradores com salário maior do que 2000
SELECT * FROM Colaboradores WHERE Salario >= 2000;

	-- Retorna todos os colaboradores com salário menor do que 2000
SELECT * FROM Colaboradores WHERE Salario < 2000;

	-- Desabilita o modo de atualização segura 
SET SQL_SAFE_UPDATES = 0;

	-- Atualiza o salário do coitado
UPDATE Colaboradores SET Salario = 2000 WHERE Nome = 'Carlos Santos';
	
    -- Reabilita o modo de atualização segura
SET SQL_SAFE_UPDATES = 1;