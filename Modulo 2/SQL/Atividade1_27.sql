/*	ATIVIDADE 01
Crie um banco de dados para um serviço de um Games Online.
O nome do Banco de dados deverá ter o seguinte nome db_generation_game_online.
O sistema trabalhará com as informações dos personagens do jogo.
O sistema trabalhará com 2 tabelas tb_personagens e tb_classes, que deverão estar relacionadas.*/

CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe(
	id bigint auto_increment primary key,
	classe varchar(255) not null,
	exp bigint not null
);

CREATE TABLE tb_personagem(
	id bigint auto_increment primary key,
	nome varchar(255),
	altura decimal(5,2),
	genero ENUM('Masculino', 'Feminino', 'Outro'),
	idade bigint,
	ataque bigint not null,
	defesa bigint not null,
	classe_id bigint not null,
	foreign key (classe_id) references tb_classe(id)
);

INSERT INTO tb_classe (classe, exp) VALUES
('Guerreiro', 1000),
('Mago', 1500),
('Ladrão', 800),
('Clerigo', 1200),
('Arqueiro', 1100);

INSERT INTO tb_personagem (nome, altura, genero, idade, ataque, defesa, classe_id) VALUES
('Herói 1', 1.80, 'Masculino', 30, 2000, 800, 1),
('Feiticeira 1', 1.65, 'Feminino', 2500, 800, 60, 2),
('Ladrão 1', 1.70, 'Masculino', 28, 1000, 700, 3),
('Clerigo 1', 1.75, 'Masculino', 35, 900, 1000, 4),
('Arqueiro 1', 1.78, 'Masculino', 27, 1100, 7050, 5),
('Herói 2', 1.85, 'Masculino', 32, 1300, 850, 1),
('Feiticeira 2', 1.70, 'Feminino', 28, 850, 650, 2),
('Ladrão 2', 1.68, 'Masculino', 26, 9050, 705, 3),
('Clerigo 2', 1.77, 'Masculino', 33, 9002, 980, 4),
('Arqueiro 2', 1.79, 'Masculino', 29, 11005, 720, 5),
('Herói 3', 1.82, 'Masculino', 31, 12500, 820, 1),
('Feiticeira 3', 1.68, 'Feminino', 26, 8800, 700, 2),
('Ladrão 3', 1.66, 'Masculino', 27, 970, 7700, 3),
('Clerigo 3', 1.76, 'Masculino', 34, 940, 9600, 4),
('Arqueiro 3', 1.81, 'Masculino', 30, 1102, 7800, 5);

SELECT * FROM tb_personagem WHERE ataque > 2000;

SELECT * FROM tb_personagem WHERE defesa BETWEEN 1000 and 2000;

SELECT * FROM tb_personagem WHERE nome LIKE '%c%';

SELECT * FROM tb_personagem inner join tb_classe on tb_personagem.classe_id = tb_classe.id;

SELECT * FROM tb_personagem inner join tb_classe on tb_personagem.classe_id = tb_classe.id
WHERE tb_classe.classe = "Ladrão";




