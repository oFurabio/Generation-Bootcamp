create database db_generation__game_online;

use db_generation__game_online;

create table tb_classes(
id bigint auto_increment,
nome_classe varchar(255) not null,
habilidade_classe  varchar(255),
primary key(id)
);

create table tb_personagens(
id bigint auto_increment primary key,
nome varchar(255) not null,
ataque bigint not  null,
defesa  bigint not null,
nivel int not null,
classe_id bigint not null,
foreign key (classe_id) references tb_classes(id)
);

INSERT INTO tb_classes (nome_classe, habilidade_classe)
VALUES
    ('Guerreiro', 'Investida'),
    ('Mago', 'Bola de Fogo'),
    ('Arqueiro', 'Precisão'),
    ('Ladrão', 'Furtivo'),
    ('Cavaleiro', 'Cavalaria');

INSERT INTO tb_personagens (nome,ataque,defesa,nivel,classe_id)
VALUES
    ('Flávio', 2500, 1500, 10, 1),    
    ('Elias', 1000, 900, 8, 2),           
    ('Raphael', 1500, 1600, 9, 3),       
    ('Raquel', 1900, 1700, 75, 4),         
    ('Liza', 2050, 1800, 75, 5),    
    ('Marcos', 3100, 2100, 9, 1),      
    ('Julia', 1600, 3000, 8, 2),     
    ('Amanda', 2300, 3000, 10, 3); 
    
 select * from tb_personagens where ataque > 2000;  
 
 select * from tb_personagens where defesa between 1000 and 2000;
 
 select * from tb_personagens where nome like '%c%';

 select * from tb_personagens
 inner join tb_classes on tb_classes.id = tb_personagens.classe_id;
 
 select * from tb_personagens
 inner join tb_classes on tb_classes.id = tb_personagens.classe_id where classe_id = 3;