create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment primary key,
nome_categoria varchar(255) not null,
descricao varchar(255)
);

create table tb_pizzas(
id bigint auto_increment primary key,
nome varchar(255) not null,
valor decimal(6,2) not null,
descricao text,
categoria_id bigint not null,
foreign key (categoria_id) references tb_categoria(id)
);

INSERT INTO tb_categoria(nome_categoria, descricao)
VALUES
    ('Salgada', 'Pizzas com ingredientes salgados'),
    ('Doce', 'Pizzas com ingredientes doces'),
    ('Vegetariana', 'Pizzas sem proteina animal'),
    ('Salgada', 'Pizzas com ingredientes salgados'),
    ('Doce','Pizzas com ingredientes doces');

INSERT INTO tb_pizzas (nome, valor, descricao, categoria_id) 
VALUES
    ('Margherita', 42.00, 'Molho de tomate, mussarela, manjericão fresco', 1),
    ('Calabresa', 47.50, 'Molho de tomate, mussarela, calabresa fatiada, cebola, azeitonas', 1),
    ('Pepperoni', 52.50, 'Molho de tomate, mussarela, pepperoni, pimentões', 1),
    ('Do Chefe', 60.00, 'Molho de tomate, frango desfiado, Catupiry, milho', 1),
    ('Da Casa veg', 54.50, 'Molho de tomate, mussarela, pimentões, cebola, tomate, azeitonas', 3),
    ('Quatro Queijos', 48.50, 'Molho de tomate, mussarela, queijo prato, gorgonzola, parmesão', 1),
    ('Romeu e  Julieta', 36.00, 'Goaibada e cream chesse', 2),
    ('Frango com Bacon',  35.00, 'Molho de tomate, mussarela, frango desfiado, bacon, milho', 1);
    

    
 select * from tb_pizzas where valor > 45;  
 
 select * from tb_pizzas where valor between 50 and 100;
 
 select * from tb_pizzas where nome like '%m%';

 select * from tb_pizzas
 inner join tb_categoria on tb_categoria.id = tb_pizzas.categoria_id;
 
 select * from tb_pizzas
 inner join tb_categoria on tb_categoria.id = tb_pizzas.categoria_id where categoria_id = 1;