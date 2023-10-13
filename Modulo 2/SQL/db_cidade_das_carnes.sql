create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment primary key,
nome_categoria varchar(255) not null,
descricao varchar(255)
);

create table tb_produtos(
id bigint auto_increment primary key,
nome varchar(255) not null,
valor decimal(6,2) not null,
descricao text,
categoria_id bigint not null,
foreign key (categoria_id) references tb_categoria(id)
);

INSERT INTO tb_categoria (nome_categoria, descricao) 
VALUES
    ('Carne Bovina', 'Produtos de carne de boi'),
    ('Carne de Porco', 'Produtos de carne de porco'),
    ('Aves', 'Produtos de carne de aves'),
    ('Peixes', 'Produtos de peixes'),
    ('Molhos para Churrasco', 'Molhos e condimentos para churrasco');


INSERT INTO tb_produtos (nome, valor, descricao, categoria_id) 
VALUES
    ('Picanha Kg', 80.95, 'Corte nobre de carne bovina', 1),
    ('Linguiça Toscana Kg', 25.00, 'Linguiça suína temperada', 2),
    ('Peito de Frango  Kg', 19.99, 'Peito de frango fresco', 3),
    ('Salmão Fresco Kg', 120.00, 'Filé de salmão fresco', 4),
    ('Molho Barbecue', 12.50, 'Molho para churrasco com sabor defumado', 5),
    ('Costela Suína kG', 55.00, 'Costela de porco para churrasco', 2),
    ('Tilápia kG', 45.00, 'Peixe tilápia fresco', 1),
    ('Molho Chimichurri', 15.00, 'Molho argentino para churrasco', 5);
    
 select * from tb_produtos where valor > 50;  
 
 select * from tb_produtos where valor between 50 and 150;
 
 select * from tb_produtos where nome like '%c%';

 select * from tb_produtos
 inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id;
 
 select * from tb_produtos
 inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id where categoria_id = 5;