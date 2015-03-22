Drop table Sessao;
Drop table Filme;
Drop table InfoAtor;
Drop table Atendente;
Drop table Ator;
Drop table Cliente;
Drop table Diretor;
Drop table Distribuidora;
Drop table Genero;
Drop table Gerente;
Drop table Ingresso;
Drop table ListaAtores;
Drop table ListaIngressos;
Drop table Sala;

Create table Atendente(
    pk int not null primary key generated always as identity(start with 1, increment by 1),
    nome varchar(40),
    login varchar(15),
    senha varchar(15)
);

Create table Ator(
    id int not null primary key generated always as identity(start with 1, increment by 1),
    nome varchar(20),
    nacionalidade varchar(20),
    datanasc date
);

Create table Cliente(
    pk int not null primary key generated always as identity(start with 1, increment by 1),
    nome varchar(30),
    anoNasc int,
    tipo varchar(15)
);

Create table Diretor(
    pk int not null primary key generated always as identity(start with 1, increment by 1),
    codigo int,
    nome varchar(30)
);

Create table Distribuidora(
    pk int not null primary key generated always as identity(start with 1, increment by 1),
    nome varchar(50)
);

Create table Filme(
    pk int not null primary key generated always as identity(start with 1, increment by 1),
    id_diretor int,
    id_genero int,
    id_listaAtores int,
    id_distribuidora int,
    nome varchar(50),
    classificacao int,
    ano int,
    duracao int,
    situacao varchar(15),
    idioma varchar(20)
);

Create table Genero(
    pk int not null primary key generated always as identity(start with 1, increment by 1), 
    nome varchar(20)
);

Create table Gerente(
    pk int not null primary key generated always as identity(start with 1, increment by 1),
    nome varchar(40),
    login varchar(15),
    senha varchar(15)
);

Create table InfoAtor(
    id_ator int,
    papel varchar(50),
    part varchar(50)
);

Create table Ingresso(
    pk int not null primary key generated always as identity(start with 1, increment by 1),
    id int,
    inteira boolean,
    tipo varchar(20)
);

Create table ListaAtores(
    pk int not null primary key generated always as identity(start with 1, increment by 1),
    id_infoator int
);

Create table ListaIngressos(
    pk int not null primary key generated always as identity(start with 1, increment by 1),
    id_ingresso int
);

Create table Sala(
    pk int not null primary key generated always as identity(start with 1, increment by 1),
    numero int,
    lotacao int,
    especial int,
    situação varchar(15)
);

Create table Sessao(
    pk int not null primary key generated always as identity(start with 1, increment by 1),
    id_filme int,
    id_sala int,
    horario date,
    legendado boolean,
    id_listaIngressos int
);

alter table filme add FOREIGN KEY(id_diretor) references Diretor(pk);
alter table filme add FOREIGN KEY(id_genero) references genero(pk);
alter table filme add FOREIGN KEY(id_listaAtores) references listaAtores(pk);
alter table filme add FOREIGN KEY(id_distribuidora) references distribuidora(pk);
alter table infoator add FOREIGN KEY(id_ator) references ator(id);
alter table Sessao add FOREIGN KEY(id_filme) references filme(pk);
alter table Sessao add FOREIGN KEY(id_sala) references sala(pk);
alter table Sessao add FOREIGN KEY(id_listaIngressos) references listaingressos(pk);

Insert into Atendente(nome, login, senha) values('Maria','mariasilva','senha'),('Silvia','silviacosta','senha');
Insert into Ator(nome, nacionalidade, datanasc) values('Brad','brasileiro','2015-01-01'),('Tom','gringo','2015-02-02');
Insert into Cliente(nome, anoNasc, tipo) values('Maria',1987,'geral'),('Joao',1997,'obeso'),('Andre',1978,'geral');
Insert into Diretor(codigo, nome) values(3672,'Quentin Tarantino'),(3243,'Steven Spielberg'),(4243,'Pedro Almodóvar'),(53532,'Alfred Hitchcock'),(3232,'Roman Polanski'),(3232,'Woody Allen'),(3232,'Stanley Kubrick'),(322,'Ingmar Bergman'),(3232,'Christopher Nolan');
Insert into Distribuidora(nome) values('Warner Bros. Pictures'),('Disney'),('Sony Pictures'),('Universal Studios'),('Paramount Pictures');
insert into Genero(nome) values('ação'),('Animação'),('Comédia'),('Cult'),('Dança'),('Documentário'),('Drama'),('Erótico'),('Fantasma'),('Faroeste'),('Ficção Cientifica'),('Guerra'),('Musical'),('Filme Noir'),('Policial'),('Romance'),('Suspense'),('Terror'),('Trash');
Insert into Gerente(nome, login, senha) values('Mario','mariosuzuki','senha'),('Sueli','suelivieira','senha');
