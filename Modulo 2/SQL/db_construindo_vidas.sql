create database db_construindo_vidas;

use db_construindo_vidas;

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
    ('Materiais de Construção', 'Materiais diversos para construção civil'),
    ('Ferramentas Manuais', 'Ferramentas de mão'),
    ('Tintas e Revestimentos', 'Tintas e vernizes'),
    ('Elétrica e Iluminação', 'Produtos elétricos e sistemas de iluminação'),
    ('Encanamento e Tubulações', 'Tubos, conexões e materiais para encanamento');
    
INSERT INTO tb_produtos (nome, valor, descricao, categoria_id) 
VALUES
    ('Cimento Votorantim', 130.99, 'Saco de cimento para construção', 1),
    ('Martelo de Carpinteiro', 12.99, 'Martelo de carpinteiro com cabo de madeira', 2),
    ('Tinta Branca', 50.49, 'Lata de tinta branca', 3),
    ('Disjuntor ', 12.00, 'Disjuntor para instalação elétrica', 4),
    ('Tubo PVC 50mm', 3.99, 'Tubo de PVC para encanamento', 5),
    ('Parafusos de Fixação', 5.99, 'Conjunto de parafusos e buchas', 2),
    ('Luminária de LED', 75.80, 'Luminária de teto com tecnologia LED', 4),
    ('Piso Cerâmico Caixa', 120.00, 'Piso de cerâmica Especial', 1);
    
 select * from tb_produtos where valor > 100;  
 
 select * from tb_produtos where valor between 70 and 150;
 
 select * from tb_produtos where nome like '%c%';

 select * from tb_produtos
 inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id;
 
 select * from tb_produtos
 inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id where categoria_id = 1;