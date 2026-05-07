use jsp;

CREATE TABLE usuarios (
    idUsuario INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    obs BLOB,
    login VARCHAR(50) UNIQUE NOT NULL,
    pass VARCHAR(255) NOT NULL,
    
    PRIMARY KEY (idUsuario)
)ENGINE = INNODB;

INSERT INTO usuarios (nome, email, obs, login, pass)
VALUES ( "Administrador", "adm@curso.com.br", "", "admin", "$2a$10$usK8ZuVfLUkeNfrIGlq7KOcIdmO0AA5Hj.L1ak8zCdp4RWQbkYe62");

INSERT INTO usuarios (nome, email, obs, login, pass)
VALUES ( "JSP", "jsp@curso.com.br", "sem informação", "jsp", "$2a$10$4BEOfZnQLBuZyRYYgTKlku6MZ6Q1VlTRzxID8O2QpXssstEzA9PnC");

INSERT INTO usuarios (nome, email, obs, login, pass)
VALUES ( "Aluno", "aluno@curso.com.br", "sem informação", "aluno", "$2a$10$HCfZ7JrVhVIB3cBPCHkC8.nm7eW86/atq.MVFymm3y7zZk6fPSbKm");

SELECT * FROM usuarios WHERE login <> "admin";

SELECT pass FROM usuarios WHERE login = "jsp";
SELECT * FROM usuarios WHERE login = "jsp";
SELECT count(1) > 0 AS retorno FROM usuarios WHERE login = "jsp";

UPDATE usuarios
SET nome = "?", email = "?", obs = "", login = "edc", pass = "123"
WHERE idUsuario = "6";

DELETE FROM usuarios WHERE idUsuario = "1";

SELECT * FROM usuarios
WHERE nome like "%jsp%" AND login <> "admin" ;

SELECT count(1) > 0 AS retorno FROM usuarios WHERE login = "novo" AND idUsuario = 18;
