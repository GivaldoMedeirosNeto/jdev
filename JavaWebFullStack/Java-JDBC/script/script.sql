use java_jdbc;

CREATE TABLE usuarios (
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,    
    PRIMARY KEY (id)
)ENGINE = INNODB;

SELECT * FROM usuarios;
INSERT INTO usuarios (nome, email) VALUES ( "Penelope Medeiros", "nega@gsmn.dev.br");
UPDATE usuarios SET nome = "Teste Java", email = "teste.java@gsmn.dev.br" WHERE id = 5;
DELETE FROM usuarios WHERE id = 3;

CREATE TABLE contatos (
    id INT NOT NULL AUTO_INCREMENT,
    id_usuario INT NOT NULL,
    contato VARCHAR(50) NOT NULL,    
    PRIMARY KEY (id),
    FOREIGN KEY (id_usuario) REFERENCES usuarios (id)
)ENGINE = INNODB;

SELECT * FROM contatos;
INSERT INTO contatos (id_usuario, contato) VALUES ( 1, "84902062020");
UPDATE contatos SET contato = "84920200206" WHERE id = 1;
DELETE FROM contatos WHERE id = 2;

SELECT MAX(id) AS idUsuario FROM usuarios;

SELECT nome, email, contato
FROM contatos
INNER JOIN usuarios ON contatos.id_usuario = usuarios.id
WHERE usuarios.id = 1;