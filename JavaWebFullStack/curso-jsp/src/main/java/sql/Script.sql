CREATE DATABASE cursojsp;
USE cursojsp;
SHOW VARIABLES LIKE "secure_file_priv";

CREATE TABLE model_login (
	id INT NOT NULL AUTO_INCREMENT,
	login VARCHAR(20) NOT NULL UNIQUE,
    pass VARCHAR(20) NOT NULL,    
	PRIMARY KEY (id)
)ENGINE = INNODB;

INSERT INTO model_login (login, pass)
VALUES ('admin', 'admin');

SELECT * FROM model_login WHERE login = "admin" AND pass = "admin";
