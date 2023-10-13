create database db_farmacia_bem_estar;

use db_farmacia_bem_estar;

create table tb_categorias(
id bigint auto_increment primary key,
nome_categoria varchar(255) not null,
descricao varchar(255)
);

create table tb_produtos(
id bigint auto_increment primary key,
nome varchar(255) not null,
valor decimal(6,2) not null,
descricao text,
categorias_id bigint not null,
foreign key (categorias_id) references tb_categorias(id)
);

INSERT INTO tb_categorias (nome_categoria, descricao) 
VALUES
    ('Medicamentos', 'Medicamentos de venda livre'),
    ('Higiene Pessoal', 'Produtos de higiene pessoal'),
    ('Cuidados com a Pele', 'Cremes e loções'),
    ('Vitaminas e Suplementos', 'Vitaminas e suplementos'),
    ('Primeiros Socorros', 'Curativos e antissépticos');

INSERT INTO tb_produtos (nome, valor, descricao, categorias_id) 
VALUES
    ('Aspirina', 35.00, 'Analgésico e antifebril', 6),
    ('Shampoo Pantene', 27.49, 'Shampoo', 7),
    ('Creme Hidratante Cerave ', 52.00, 'Hidratação para a pele seca', 8),
    ('Vitamina C', 55.00, 'Suplemento vitamínico', 9),
    ('Curativo Band-Aid', 3.49, 'Curativo adesivo', 10),
    ('Ibuprofeno', 20.00, 'Analgésico anti-inflamatório', 6),
    ('Gel de Banho Cerave', 45.09, 'Gel de banho hidratante', 7),
    ('Protetor Solar La-Roche', 80.00, 'Proteção solar FPS 90', 8);
    
 select * from tb_produtos where valor > 50;  
 
 select * from tb_produtos where valor between 50 and 60;
 
 select * from tb_produtos where nome like '%c%';

 select * from tb_produtos
 inner join tb_categorias on tb_categorias.id = tb_produtos.categorias_id;
 
 select * from tb_produtos
 inner join tb_categorias on tb_categorias.id = tb_produtos.categorias_id where categorias_id = 6;