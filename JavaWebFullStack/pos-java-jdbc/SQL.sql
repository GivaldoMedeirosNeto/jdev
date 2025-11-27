CREATE TABLE userposjava (
	id INT NOT NULL AUTO_INCREMENT,
	nome VARCHAR(20) NOT NULL,
    email VARCHAR(20) NOT NULL,    
	PRIMARY KEY (id)
)ENGINE = INNODB;

CREATE TABLE telposjava (
	id INT NOT NULL AUTO_INCREMENT,
	tipo VARCHAR(20) NOT NULL,
    numero VARCHAR(20) NOT NULL,
    iduser INT NOT NULL,
	PRIMARY KEY (id),
    FOREIGN KEY (iduser) REFERENCES userposjava (id)
)ENGINE = INNODB;

INSERT INTO userposjava (nome, email)
VALUES  ('Penelope', 'nega@gsmn.dev.br') ;

INSERT INTO userposjava (nome, email)
VALUES  ('Givaldo', 'givaldo@gsmn.dev.br') ;

SELECT * FROM userposjava;
SELECT * FROM telposjava;

SELECT * FROM userposjava where id = 1;

UPDATE userposjava  set nome = "Teste", email = "teste@teste.com" where id = 3;


SELECT MAX(id) AS ultimo_id FROM userposjava;
