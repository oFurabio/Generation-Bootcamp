create database db_curso_da_minha_vida;

use db_curso_da_minha_vida;

create table tb_categoria(
id bigint auto_increment primary key,
nome_categoria varchar(255) not null,
descricao varchar(255)
);

create table tb_cursos(
id bigint auto_increment primary key,
nome varchar(255) not null,
valor decimal(6,2) not null,
salas varchar(30),
categoria_id bigint not null,
foreign key (categoria_id) references tb_categoria(id)
);

INSERT INTO tb_categoria (nome_categoria, descricao) 
VALUES
    ('Programação', 'Cursos de desenvolvimento de software'),
    ('Design Gráfico', 'Cursos de design gráfico'),
    ('Marketing Digital', 'Cursos de marketing online'),
    ('Idiomas', 'Cursos de idiomas'),
    ('Administração', 'Cursos de administração de empresas e gestão');
    
INSERT INTO tb_cursos (nome, valor, salas, categoria_id) 
VALUES
    ('Curso de Desenvolvimento Web', 800.00, 'Sala 101', 1),
    ('Curso de Photoshop ', 450.00, 'Sala 102', 2),
    ('Curso de Marketing de Redes Sociais', 650.00, 'Sala 103', 3),
    ('Curso de Inglês Intermediário', 400.00, 'Sala 104', 4),
    ('Curso de Gestão Empresarial', 745.50, 'Sala 105', 5),
    ('Curso de Python para Iniciantes', 350.39, 'Sala 101', 1),
    ('Curso de Illustrator', 550.00, 'Sala 102', 2),
    ('Curso de SEO', 700.00, 'Sala 103', 3);

INSERT INTO tb_cursos (nome, valor, salas, categoria_id) 
VALUES
    ('Curso de Desenvolvimento de jogos', 800.00, 'Sala 108', 1);
    
 select * from tb_cursos where valor > 500;  
 
 select * from tb_cursos where valor between 600 and 1000;
 
 select * from tb_cursos where nome like '%j%';

 select * from tb_cursos
 inner join tb_categoria on tb_categoria.id = tb_cursos.categoria_id;
 
 select * from tb_cursos
 inner join tb_categoria on tb_categoria.id = tb_cursos.categoria_id where categoria_id = 1;