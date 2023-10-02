-- Criar o banco de dados
CREATE DATABASE ECommerce_DB;

-- Usar o banco de dados
USE ECommerce_DB;

-- Criar a tabela de produtos
CREATE TABLE Produtos (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(100) not null,
    Categoria VARCHAR(50) not null,
    Preco DECIMAL(10, 2) not null,
    Estoque INT not null
);

-- Inserir alguns registros
INSERT INTO Produtos (Nome, Categoria, Preco, Estoque)
VALUES
    ('PlayStation 5', 'Eletrônicos', 3789.90, 10),
    ('Calça Jeans para Jovem de 16 anos', 'Roupas', 301.00, 20),
    ('Bíblia Sagrada', 'Livros', 89.99, 15),
    ('Soundbar Samsung', 'Eletrônicos', 1179.00, 5),
    ('Pulseira de Pérolas', 'Acessórios', 70.00, 8),
    ('Boné Mike', 'Roupas', 350.00, 12),
    ('O Código Da Vinci', 'Livros', 180.00, 25),
    ('Relógio de Pulso', 'Acessórios', 900.00, 3);
    
-- Buscar produtos por mais de 500 reais
SELECT * FROM Produtos WHERE Preco > 500;
    
-- Buscar produtos por menos de 500 reais
SELECT * FROM Produtos WHERE Preco < 500;

-- Desabilita o modo de atualização segura
SET SQL_SAFE_UPDATES = 0;

-- Atualizar preço do produto
UPDATE Produtos SET Preco = 299.00 WHERE Nome = 'Calça Jeans para Jovem de 16 anos';

-- Reabilita o modo de atualização segura
SET SQL_SAFE_UPDATES = 1;
