Drop table Atendente;
Drop table Ator;
Drop table Cliente;
Drop table Diretor;
Drop table Distribuidora;
Drop table Filme;
Drop table Funcionario;
Drop table Genero;
Drop table Gerente;
Drop table InfoAtor;
Drop table Ingresso;
Drop table ListaAtores;
Drop table ListaIngressos;
Drop table Sala;
Drop table Sessao;

Create table Atendente(
    pk int
    nome varchar(40)
    login varchar(15)
    senha varchar(15)
);

Create table Ator(
    id int,
    nome varchar(20)
    nacionalidade varchar(20)
    datanasc date
);

 Insert into Ator values(1,'Brad','brasileiro','2015-01-01'),(2,'Tom','gringo','2015-02-02');

Create table Cliente(
    pk int
    nome varchar(30)
    anoNasc int
    tipo varchar(15)
);

Create table Diretor(
    pk int
    codigo int
    nome varchar(30)
);

Create table Distribuidora(
    pk int
    nome varchar(50)
);

Create table Filme(
    pk int
    id_diretor int
    id_genero int
    listaAtores int
    distribuidora int
    nome varchar(50)
    classificacao int
    ano int
    duracao int
    situacao varchar(15)
    idioma varchar(20)
);

Create table Generos(
    id int, 
    nome varchar(20)
);

insert into Generos values(1,'ação'),(2,'Animação'),(3,'Chanchada'),(4,'Comédia'),(5,'Cult'),(6,'Dança'),(7,'Documentário'),(8,'Drama'),(9,'Erótico'),(10,'Fantasma'),(11,'Faroeste'),(12,'Ficção Cientifica'),(13,'Guerra'),(14,'Musical'),(15,'Filme Noir'),(16,'Policial'),(17,'Romance'),(18,'Suspense'),(19,'Terror'),(20,'Trash');

Create table Gerente(
    pk int
    nome varchar(40)
    login varchar(15)
    senha varchar(15)
);

Create table InfoAtor(
    id_ator
    papel varchar(50)
    part varchar(50)
);

Create table Ingresso(
    pk int
    id int
    inteira bit
    tipo varchar(20)
);

Create table ListaAtores(
    //lista infoatores
);

Create table ListaIngressos(
    pk int
    //lista de ingressos
);

Create table Sala(
    pk int
    numero int
    lotacao int
    especial int
    situação varchar(15)
);

Create table Sessao(
    pk int
    id_filme int
    id-sala int
    horario date
    legendado bit
    id_listaIngresso int
);